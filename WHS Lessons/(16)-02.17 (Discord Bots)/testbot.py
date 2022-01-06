import discord
from discord.ext import commands
import random
import time
import asyncio

# variables
intents = discord.Intents().all()
bot = commands.Bot(command_prefix='[')

@bot.event
async def on_ready():
    print('Logged in as')
    print(bot.user.name)
    print('------')
    info = discord.Activity(name="Comp Sci Tournament", type=5)
    await bot.change_presence(status=discord.Status.dnd, activity=info)

@bot.event
async def on_message(message):
    ctx = await bot.get_context(message)
    await bot.invoke(ctx)
    if message.content.startswith("I'm "):
        await ctx.send("Hi " + message.content[4:] + ". I'm CompSci Bot!")
    elif message.content.startswith("Im "):
        await ctx.send("Hi " + message.content[3:] + ". I'm CompSci Bot!")
    if "thonk" in message.content:
        await message.add_reaction("🤔")

@bot.command()
async def test(ctx, arg):
    await ctx.send(arg)

@bot.command()
async def rps(ctx, arg: str):
    compmove = random.randint(1, 3)
    usermove = 1
    choices = ["rock", "paper", "scissors"]
    if(arg[:1].lower()=="r"):
        usermove = 1
    elif(arg[:1].lower()=="p"):
        usermove = 2
    elif(arg[:1].lower()=="s"):
        usermove = 3
    announce = "You chose " + choices[usermove-1] + " while the computer chose " + choices[compmove-1] + ".\n"
    if(usermove == compmove):
        await ctx.send(announce + "TIE!")
    elif(usermove == (compmove+1) or usermove == (compmove-2)):
        await ctx.send(announce + "YOU WIN!")
    else:
        await ctx.send(announce + "YOU LOSE!")

bot.run('Insert token here, hopefully wont leak on stream')