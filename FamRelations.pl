% facts
man(brett). 
man(riley). 
man(reuben). 
man(thomas).

woman(libby). 
woman(pamela). 
woman(andrea). 
woman(kate).

victim(brett).

play_scrabble(reuben). 
play_scrabble(riley). 
play_scrabble(libby).

harvest(kate). 
harvest(riley).

play_golf(thomas). 
play_golf(reuben).

smoker(andrea). 
smoker(reuben). 
smoker(kate). 
smoker(brett).
smoker(libby).

room(rm_701). 
room(rm_702). 
room(rm_703). 
room(rm_704). 
room(rm_705).

lodge(brett,rm_702). 
lodge(riley,rm_704). 
lodge(andrea,rm_701). 
lodge(reuben,rm_704). 
lodge(thomas,rm_702). 
lodge(libby,rm_703). 
lodge(pamela,rm_701). 
lodge(kate,rm_703).

gun_owner(riley). 
gun_owner(reuben). 
gun_owner(pamela).

% rules
suspect(X) :- (man(X); woman(X)), \+victim(X).
has_alibi(X) :- suspect(X), play_scrabble(X).

went_out_twice(X) :- harvest(X), play_golf(X).
went_out_twice(X) :- harvest(X), smoker(X).
went_out_twice(X) :- play_golf(X), smoker(X).
went_out_thrice(X) :- harvest(X), play_golf(X), smoker(X).
went_out(X) :- (harvest(X), \+play_golf(X), \+smoker(X)); (play_golf(X), \+harvest(X), \+smoker(X)); (smoker(X), \+harvest(X), \+play_golf(X)); went_out_twice(X); went_out_thrice(X).

roommates(X,Y) :- lodge(X, Z), lodge(Y, Z), X\==Y.
has_access_gun(X) :- gun_owner(X).
has_access_gun(X) :- roommates(X,Y), gun_owner(Y), \+gun_owner(X).
culprit(X) :- suspect(X), went_out(X), has_access_gun(X), \+has_alibi(X).

% Culprit is Andrea

% Bonus
% Let's try to unify:
% Head
% two = one 

% Tail
% [] = A 

% The syntax '[two|[]]' isn't a list itself but it is a part of prolog's special facility to split parts of a list.
% You can't split the list into a head and tail if the implementation itself ([H|T]) is empty.
% Therefore, either the implementation of head or tail can't be empty (([]|X) or (X|[]) is not possible). 