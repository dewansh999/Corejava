#include <iostream>

template <typename T>
T compare(T a, T b)
{
  return (a > b) ? a : b;
}

int main()
{
  int i1 = 100, i2 = 400;
  float f1 = 13.5, f2 = 11.5;
  char c1 = 'a', c2 = 'z';

  std::cout << "Largest of two int variable values: " << compare(i1, i2) << std::endl;
  std::cout << "Largest of two float variable values: " << compare(f1, f2) << std::endl;
  std::cout << "Largest of two char variable values: " << compare(c1, c2) << std::endl;

  return 0;
}
