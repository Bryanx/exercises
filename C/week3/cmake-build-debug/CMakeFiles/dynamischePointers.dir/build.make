# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.6

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /Applications/CLion.app/Contents/bin/cmake/bin/cmake

# The command to remove a file.
RM = /Applications/CLion.app/Contents/bin/cmake/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /Users/Bryan/Programmeren/exercises/C/week3

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/Bryan/Programmeren/exercises/C/week3/cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/dynamischePointers.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/dynamischePointers.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/dynamischePointers.dir/flags.make

CMakeFiles/dynamischePointers.dir/dynamischePointers.c.o: CMakeFiles/dynamischePointers.dir/flags.make
CMakeFiles/dynamischePointers.dir/dynamischePointers.c.o: ../dynamischePointers.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/Bryan/Programmeren/exercises/C/week3/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/dynamischePointers.dir/dynamischePointers.c.o"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc  $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/dynamischePointers.dir/dynamischePointers.c.o   -c /Users/Bryan/Programmeren/exercises/C/week3/dynamischePointers.c

CMakeFiles/dynamischePointers.dir/dynamischePointers.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/dynamischePointers.dir/dynamischePointers.c.i"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc  $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/Bryan/Programmeren/exercises/C/week3/dynamischePointers.c > CMakeFiles/dynamischePointers.dir/dynamischePointers.c.i

CMakeFiles/dynamischePointers.dir/dynamischePointers.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/dynamischePointers.dir/dynamischePointers.c.s"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc  $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/Bryan/Programmeren/exercises/C/week3/dynamischePointers.c -o CMakeFiles/dynamischePointers.dir/dynamischePointers.c.s

CMakeFiles/dynamischePointers.dir/dynamischePointers.c.o.requires:

.PHONY : CMakeFiles/dynamischePointers.dir/dynamischePointers.c.o.requires

CMakeFiles/dynamischePointers.dir/dynamischePointers.c.o.provides: CMakeFiles/dynamischePointers.dir/dynamischePointers.c.o.requires
	$(MAKE) -f CMakeFiles/dynamischePointers.dir/build.make CMakeFiles/dynamischePointers.dir/dynamischePointers.c.o.provides.build
.PHONY : CMakeFiles/dynamischePointers.dir/dynamischePointers.c.o.provides

CMakeFiles/dynamischePointers.dir/dynamischePointers.c.o.provides.build: CMakeFiles/dynamischePointers.dir/dynamischePointers.c.o


# Object files for target dynamischePointers
dynamischePointers_OBJECTS = \
"CMakeFiles/dynamischePointers.dir/dynamischePointers.c.o"

# External object files for target dynamischePointers
dynamischePointers_EXTERNAL_OBJECTS =

dynamischePointers: CMakeFiles/dynamischePointers.dir/dynamischePointers.c.o
dynamischePointers: CMakeFiles/dynamischePointers.dir/build.make
dynamischePointers: CMakeFiles/dynamischePointers.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/Bryan/Programmeren/exercises/C/week3/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable dynamischePointers"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/dynamischePointers.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/dynamischePointers.dir/build: dynamischePointers

.PHONY : CMakeFiles/dynamischePointers.dir/build

CMakeFiles/dynamischePointers.dir/requires: CMakeFiles/dynamischePointers.dir/dynamischePointers.c.o.requires

.PHONY : CMakeFiles/dynamischePointers.dir/requires

CMakeFiles/dynamischePointers.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/dynamischePointers.dir/cmake_clean.cmake
.PHONY : CMakeFiles/dynamischePointers.dir/clean

CMakeFiles/dynamischePointers.dir/depend:
	cd /Users/Bryan/Programmeren/exercises/C/week3/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/Bryan/Programmeren/exercises/C/week3 /Users/Bryan/Programmeren/exercises/C/week3 /Users/Bryan/Programmeren/exercises/C/week3/cmake-build-debug /Users/Bryan/Programmeren/exercises/C/week3/cmake-build-debug /Users/Bryan/Programmeren/exercises/C/week3/cmake-build-debug/CMakeFiles/dynamischePointers.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/dynamischePointers.dir/depend

