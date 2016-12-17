package builtinControlStructures

object main extends App {
  for (arg <- args) {
    print("引数 "  + ": ");
    println(arg);
  }
}