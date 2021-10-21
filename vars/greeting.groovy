def call(String name) {
  sh """
    echo "Hello ${name}, I AM FROM THE SHARED LIBRARY"
  """
}
