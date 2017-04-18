cmake_minimum_required(VERSION 3.6)
project(week2)

set(CMAKE_C_STANDARD 99)

set(SOURCE_FILES main.c)
add_executable(week2 ${SOURCE_FILES})
add_executable(pointers pointers.c)
add_executable(randomPointers randomPointers.c)
add_executable(pointersArrays pointersArrays.c)
add_executable(tekeningen tekeningen.c)