The idea is to put all the opening brackets in the stack. Whenever you hit a closing bracket, search if the top of the stack is the opening bracket of the same nature. 
If this holds then pop the stack and continue the iteration. 
In the end if the stack is empty, it means all brackets are balanced or well-formed. Otherwise, they are not balanced.
