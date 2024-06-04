#include <iostream>
#include <algorithm>

int main()
{
  int arr[] = {10, 20, 30, 40, 50, -60};
  // Determine the size of the array dynamically
  size_t arrSize = sizeof(arr) / sizeof(arr[0]);

  // Use std::all_of to check if all elements are positive
  bool allPositive = std::all_of(arr, arr + arrSize, [](int x)
                                 { return x > 0; });
  // Output the result
  std::cout << (allPositive ? "All are positive" : "All are not positive") << std::endl;

  return 0;
}
