# Project-2
So I thought that I would be able to submit a .pdf of all of my notes, however this will not ssuffice this go around. So instead, I shall copy my notes onto this page.
- Need to be able to calculate ASCII Average using calAverage()
- Need to be able to calculate ASCII Ceiling using calAverage()
- Need to be able to calculate ASCII Floor using calAverage()
- Need to be able to calculate letterAverage using calAverage()
- What I want each class to do:
- Main.java (Nothing
- MesoStation.java (Also nothing)
- MesoAbstract.java (create Abstract class that can make abstract methods/variables accessible for MesoInherit class)
- MesoInherit.java (If the calAverage method is returning an int[], this means that the array contains overall average at element zero, ceiling of element zero goes into element 1, and floor of element zero goes into element 2.
- letterAverage() should take calAverage[0] and find the letter corresponding. I might make this easier by making a ArrayList<Character> alphabet to refer to. **Important to note that I was able to make this more simple by instead creating a String of the alphabet as I can utilize the IndexOf method**
- int letter = calAverage()[0] - 64;
- return alphabet.get(letter) **did not actually implement this**
- ASSCII Value: place where letter falls in alphabet plus 64.
- ASCII Average: Add each ASCII value of station ID and divide by 4 (Round to int) will return int
- ASCII Ceiling: math.ceil(calAverage()) will return int
- ASCII Floor: math.floor(calAverage()) will return int
- letterAverage: take ASCII average and find letter that correspond. Will return type char.
- Ideas: 1- make ArrayList<Character> alphabet for reference especially for letterAverage method. 
- 2- How do I assign a value to each char type of StID String?
- I then went on to map out how exactly the abstract methods/variables would be passed to each class and how to do it in a way that the Project 2 write-up is asking for. 
  
  - Christian Hackelman
    113075103
