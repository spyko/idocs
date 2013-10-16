1) With average 8 characters per word/string in UTF-8 a word/string will consume 8 bytes. But in Java strings
uses UTF-16 by default. Thus in mind, the maximum amount of words will be 12.5 Million. The exact number cannot be determined because we
don't know how many words will be equal as well as some of the heap will be used to run the program.

2) If you have memory resources avaible you can change the heap space by using these parameters in Virtual Machine:
-Xms128m
-Xmx512m

3) In my case, I maintain two sets of Strings for each input file and one set of String for the words
that are equal. It could be more efficient regarding memory manipulation, if in every iteration the word that
have checked already to be removed from the set. But to remove objects while iterating the set is not so good
practice in case you want to use the set again later on.

4) In general HashSet are extremely fast regarding perfomance. The tree set may provide some
delay but not a significant one.

