def printFromFunction() {
  println("I am printing from a function")
}

def replaceString(String text) {
  text = text.replaceAll("%BUILD_NUMBER%", "${BUILD_NUMBER}")
  writeFile file: "index.html", text: text
  return text
}
