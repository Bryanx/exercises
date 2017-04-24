cmake_minimum_required(VERSION 3.6)
project(week3)

set(CMAKE_C_STANDARD 99)

set(SOURCE_FILES main.c)
add_executable(week3 ${SOURCE_FILES})
add_executable(pointerlus pointerlus.c)
add_executable(pointer2doef pointer2doef.c)
add_executable(heap heap.c)
add_executable(dynamischePointers dynamischePointers.c)
add_executable(callByRef callByRef.c)
add_executable(wisselFunctie wisselFunctie.c)
add_executable(verhoogGetallen verhoogGetallen.c)