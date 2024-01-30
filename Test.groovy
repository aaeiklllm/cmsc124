

// -- PRINTING --
// System.out.println ("Hello World");
// println ("Hello World");
// System.out.print ("Hello World");
// print ("Hello World");


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

// def (String a, int b, double c) = ["Hello", 40, 50.4]
// println a
// println b
// println c


// -- ARRAYS --
// Declaring an Array: 1st way
// def birds = new String[2]
// birds[0] = "Ibong Adarna"
// birds.putAt(1, "Agila")
         
// println birds 

// Declaring an Array: 2nd way  
// def birds = ["Ibong Adarna", "Agila", "Maya"] as String[] // You say that this is an array of Strings         
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

// list.each{val->
//     println val
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
//       st.setStudentID(1);
//       st.setStudentName("Joe");
		
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