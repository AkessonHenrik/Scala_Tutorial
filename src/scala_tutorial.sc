// Exercices niveau 1

// 1.1
var nom = ""
var prenom = ""

// 1.2
nom = "Akesson"
prenom = "Henrik"

// 1.3
// val dateDeNaissance = ""
// dateDeNaissance = "27/08/1991" pas possible car dateDeNaissance est immuable
val dateDeNaissance = "27/08/1991"


// 1.4
println(1.4)
val phrase = "Bonjour, je m’appelle " + prenom + " " + nom + " et je suis né le " + dateDeNaissance + "."
println(phrase)

// 1.5
println(1.5)
val compteur = 0
do {
  println(phrase)
} while (compteur != 0)
// Do while nécessaire car compteur est immuable donc toujours == 0.
// Do..while permet d'executer au moins une fois le contenu de la structure


// 1.6
println(1.6)
var i = 4
while (i >= compteur) {
  println(phrase)
  i = i - 1
}

// 1.7
println(1.7)
for (_ <- compteur to compteur + 4) {
  println(phrase)
}


// 1.8
println(1.8)
for (i <- 0 until 5) {
  println(phrase)
}

// 1.9
println(1.9)
if (compteur == 0) {
  println(nom)
} else {
  println(prenom)
}

// 1.10
println("1.10")
compteur match {
  case 0 => println(nom)
  case 1 => println(prenom)
}

// 2.1
println(2.1)
i = 1
while (i <= 100) {
  if (i % 3 == 0 || i % 5 == 0)
    print(i + ",")
  i = i + 1
}

// 2.2
println(2.2)
def func(i: Int, j: Int): Unit = {
  println(scala.math.max(i, j))
}
func(3, 5)

// 2.3
println(2.3)
def func2(str: String): Unit = {
  str match {
    case "Hello" => println("World")
    case "World" => println("Hello")
    case default => println("Goodbye")
  }
}
func2("Hello")
func2("World")
func2("Heoiyj")

// 2.4
println(2.4)
var com = 0
for (i <- 0 until 3; j <- 0 to 3; k <- 0 until 4) {
  println("Hello World !")
  com += 1
}
println(com)
// Le message est affiché 48 fois, c.f variable com

// 2.5
println(2.5)
def func3(str: String): Unit = {
  str match {
    case l if str.length % 2 == 1 => println(str.length)
    case "Hello World" => println(str)
    case default => println("Goodbye")
  }
}
func3("Hello World")
func3("Hey")
func3("Heyy")


// 2.6
println(2.6)

var compteur2 = 0
var compteur3 = 0
while (compteur2 < 10) {
  compteur2 match {
    case l if compteur2 % 2 == 0 => compteur2 += 3
    case _ => compteur2 += 1
  }
  compteur3 += 1
}
println("Boucle executée " + compteur3 + " fois")
println("compteur2 = " + compteur2)


// 2.7
println(2.7)

def func4(i: Int): Int = {
  i match {
    case l if i > 100 => return i
    case l if i % 7 == 0 => func4(i + 8)
    case l if i % 2 == 0 => func4(i + 12)
    case _ => func4(i + 1)
  }
}
val x = 0
println(func4(x))
println(x)
// 112
// non car x immuable
//

// 2.8
println(2.8)

def func8(x: Int, y: Int, z: Int): Int = {
  z match {
    case l1 if z % 2 == 0 => x * x + y * y
    case l2 if z % 2 == 1 => (x + y) * (x + y)
    case l3 if z == 0 => x * x + y * y + (x + y) * (x + y)
  }
}
println(func8(2, 3, 1))
println(func8(2, 3, 2))
println(func8(2, 3, 0))
// z = 0 incorrect car 0 % 2 == 0
// Corrigé:
def func9(x: Int, y: Int, z: Int): Int = {
  z match {
    case l1 if z % 2 == 0 && z > 0 => x * x + y * y
    case l2 if z % 2 == 1 => (x + y) * (x + y)
    case l3 if z == 0 => x * x + y * y + (x + y) * (x + y)
  }
}
println(func9(2, 3, 0))

// 2.9
println(2.9)

def func10match(x: Int, y: Int): Int = {
  x match {
    case l0 if x == y => {
      if (y == 0) 42 else x
    }
    case l2 if x > y => {
      x match {
        case l3 if x % 3 == 0 && y % 4 == 0 => x * x + y * y * y
        case l if x % 2 == 1 => 2 * x + 3 * y
        case l2 if y % 2 == 1 => 4 * x - 7 * y
      }
    }
    case l1 if x < y => {
      if (x > 4)
        2 * x
      else
        (x + y) * (x + y)
    }
  }
}
println(func10match(9, 4))
//def func10bool(x: Int, y: Int): Unit = {
//
//}

// 2.10
println("2.10")
def fibo(n: Int): Int = {
  var i = 0
  var iNext = 1
  var somme = 0
  for(iter <- 0 to n) {
    var tmp = iNext + i
    i = iNext
    iNext = tmp
    somme += tmp
  }
  somme
}

println("Result = " + fibo(20))