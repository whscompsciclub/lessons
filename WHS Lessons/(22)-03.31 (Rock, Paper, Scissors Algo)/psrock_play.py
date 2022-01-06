######
# ICS Problem 2.2.8 Strategy Game: PS Rock
#
# Execute this file psrock_play.py to play a tournament.
# psrock.py implements the round robin tournament of rock paper scissors
# 
# Prior to execution:
# Line 22: Type each team's module name (the file name, but without the py) on the import statement,
# Lines 27-30: Create a reload() statement for each module, and
# Original line 36: Place each module name as an arugment to the function psrock.round_robin().
# Each player should have their own .py file containing 
# a function called move(my_history, their_history)
# These filenames (without the .py extension) are passed to the 
# round_robin() function as the 2nd, 3rd, etc. arguments.
#
# (c) 2015 Project Lead The Way, Inc.
#######

import psrock
reload(psrock)

import team1, team2, team3, team4, team5  # These are file names in this folder     
# The reload() statement is needed for each team because import 
# will only compile source code once to create the pyc file and store in memory.
# Without reload(), changes to the .py file will be ignored unless the pyc 
# file is deleted and the kernel restarted. 
reload(team1) 
reload(team2)
reload(team3)
reload(team4)
reload(team5)
                        
# The first argument of round_robin() specifies the number of 
# rounds to be played by each pair of strategies. 
# Change the other arguments to use more teams, fewer teams, or different teams
short_report, long_report = psrock.round_robin(20, team1, team2, team3, team4, team5)        

for team in long_report:
    print '-'*80
    print long_report[team]
    
print short_report