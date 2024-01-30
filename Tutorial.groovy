// -- PRINTING --
// System.out.println ("Hello World");
// println ("Hello World");
// System.out.print ("Hello World");
// print ("Hello World");

// -- USER INPUT --
print "Enter your name: "
def name = System.console().readLine() 
println "You entered $name"

// -- VARIABLES --
// def _name1 = "Mika" 
// String name = "Mika"
// println _name1
// println name

// Cannot start with a number!
// def 1name 

// Groovy supports dynamic typing
// def name = "Mika"
// name = 10
// println name

// -- PRINTING VARIABLES --
// def name = "Mika" 
// println "My name is " + name
// println "My name is ${name}"
// println 'My name is ${name}'

// -- LOOPS -- 
// int count = 0;
		
// while(count<5) {
//     println(count);
//     count++;
// }

// for(int i = 0; i < 5; i++) {
//          println(i);
// }

// int[] array = [0,1,2,3]; 
		
// for(int i in array) { 
//     println(i); 
// } 

// -- METHODS --
// class Example { 
//    static void sum(int a, int b = 5) { 
//       int c = a + b; 
//       println(c); 
//    } 
	
//    static void main(String[] args) {
//       sum(6); 
//    } 
// }

//-- MULTIPLE ASSIGNMENT --
// def (a, b, c) = [30, 40, 50]
// println a 
// println b 
// println c

// def (String d, int e, double f) = ["Hello", 40, 50.4]
// println d
// println e
// println f


// -- ARRAYS --
// Declaring an Array: 1st way
// def birds = new String[2]
// birds[0] = "Ibong Adarna"
// birds.putAt(1, "Agila")

// Declaring an Array: 2nd way  
// def birds = ["Ibong Adarna", "Agila", "Maya"] as String[] // You say that this is an array of Strings         
// println birds

// Declaring an Array: 3rd way  
// String[] birds = ["Ibong Adarna", "Agila", "Maya"]
// println birds 

// // Accessing items of an array
// println birds[2] 
// println birds.getAt(1)


// -- STRING INDEXING --
// String sample = "Hello world"
// println(sample[4]) 
// println(sample[-1]) 
// println(sample[1..5]) 


// -- LISTS --
// def listSample = ["Joseph", 1, 1.50] 

// for(items in listSample) { 
//     println "${items}"
// }

// -- EACH --
// def list = [1,2,5,7]

// list.each{
//     println it
// }

// list.eachWithIndex{it,index->
//     println "value " + it + " at index " +index
// }

// -- MAP --
// class Person {
//   String name 
//   int age
// }

// def mapOfPeople = [
//   "P1": new Person(name: "Joseph", age: 30),
//   "P2": new Person(name: "Mary", age: 25)
// ] 

// mapOfPeople.collect {
//   print (it.value.name + " ")
//   println (it.value.age) 
// }

// -- OBJECTS --
// class Student {
//    private int StudentID;
//    private String StudentName;
	
//    void setStudentID(int pID) {
//       StudentID = pID;
//    }
	
//    void setStudentName(String pName) {
//       StudentName = pName;
//    }
	
//    int getStudentID() {
//       return this.StudentID;
//    }
	
//    String getStudentName() {
//       return this.StudentName;
//    }
	
//    static void main(String[] args) {
//       Student st = new Student();
//       st.setStudentID(202146220)
//       st.setStudentName("Mika")
		
//       println(st.getStudentID());
//       println(st.getStudentName());
//    } 
// }



// -- EXCEPTIONS --
// class Example {
//    static void main(String[] args) {
//       File file = new File("E://file.txt");
//       FileReader fr = new FileReader(file);
//    } 
// }

// class Example {
//    static void main(String[] args) {
//       try {
//          def arr = new int[3];
//          arr[5] = 5;
//       } catch(Exception ex) {
//          println("Catching the exception");
//       }
		
//       println("Let's move on after the exception");
//    }
// }


// -- INFINITE RECURSION --
// class Recursion {
// static void Geek(int N){

//     if (N == 0)
//         return;
 
//     System.out.print( N +" ");
//     Geek(N)
// }
 
// public static void main(String[] args){
//     int N = 5;
//     Geek(N)
//     }
// }
