'''The function move(my_history, their_history) must return 'r', 'p', or 's'.
my_history and their_history are strings of the same length, perhaps length zero.
'''

import random

strategy_name = 'Random'       
                     
def move(my_history, their_history):
    pick = random.choice(['r', 'p', 's'])
    return pick