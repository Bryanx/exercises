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
CMAKE_SOURCE_DIR = /Users/Bryan/Programmeren/exercises/C/week1

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/arrays.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/arrays.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/arrays.dir/flags.make

CMakeFiles/arrays.dir/arrays.c.o: CMakeFiles/arrays.dir/flags.make
CMakeFiles/arrays.dir/arrays.c.o: ../arrays.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/arrays.dir/arrays.c.o"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc  $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/arrays.dir/arrays.c.o   -c /Users/Bryan/Programmeren/exercises/C/week1/arrays.c

CMakeFiles/arrays.dir/arrays.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/arrays.dir/arrays.c.i"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc  $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/Bryan/Programmeren/exercises/C/week1/arrays.c > CMakeFiles/arrays.dir/arrays.c.i

CMakeFiles/arrays.dir/arrays.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/arrays.dir/arrays.c.s"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc  $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/Bryan/Programmeren/exercises/C/week1/arrays.c -o CMakeFiles/arrays.dir/arrays.c.s

CMakeFiles/arrays.dir/arrays.c.o.requires:

.PHONY : CMakeFiles/arrays.dir/arrays.c.o.requires

CMakeFiles/arrays.dir/arrays.c.o.provides: CMakeFiles/arrays.dir/arrays.c.o.requires
	$(MAKE) -f CMakeFiles/arrays.dir/build.make CMakeFiles/arrays.dir/arrays.c.o.provides.build
.PHONY : CMakeFiles/arrays.dir/arrays.c.o.provides

CMakeFiles/arrays.dir/arrays.c.o.provides.build: CMakeFiles/arrays.dir/arrays.c.o


# Object files for target arrays
arrays_OBJECTS = \
"CMakeFiles/arrays.dir/arrays.c.o"

# External object files for target arrays
arrays_EXTERNAL_OBJECTS =

arrays: CMakeFiles/arrays.dir/arrays.c.o
arrays: CMakeFiles/arrays.dir/build.make
arrays: CMakeFiles/arrays.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable arrays"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/arrays.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/arrays.dir/build: arrays

.PHONY : CMakeFiles/arrays.dir/build

CMakeFiles/arrays.dir/requires: CMakeFiles/arrays.dir/arrays.c.o.requires

.PHONY : CMakeFiles/arrays.dir/requires

CMakeFiles/arrays.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/arrays.dir/cmake_clean.cmake
.PHONY : CMakeFiles/arrays.dir/clean

CMakeFiles/arrays.dir/depend:
	cd /Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/Bryan/Programmeren/exercises/C/week1 /Users/Bryan/Programmeren/exercises/C/week1 /Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug /Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug /Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug/CMakeFiles/arrays.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/arrays.dir/depend
