cmake_minimum_required(VERSION 3.6)
project(week4)

set(CMAKE_C_STANDARD 99)

set(SOURCE_FILES main.c)
add_executable(week4 ${SOURCE_FILES})
add_executable(arraylist arraylist.c)
add_executable(linkedlist linkedlist.c)
add_executable(stackArray stackArray.c)
add_executable(stackLinked stackLinked.c)
add_executable(queueArray queueArray.c)
add_executable(queueLinked queueLinked.c)
add_executable(compareArrays compareArrays.c)