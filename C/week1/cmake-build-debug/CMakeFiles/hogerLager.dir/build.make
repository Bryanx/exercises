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
include CMakeFiles/hogerLager.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/hogerLager.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/hogerLager.dir/flags.make

CMakeFiles/hogerLager.dir/hogerLager.c.o: CMakeFiles/hogerLager.dir/flags.make
CMakeFiles/hogerLager.dir/hogerLager.c.o: ../hogerLager.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/hogerLager.dir/hogerLager.c.o"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc  $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/hogerLager.dir/hogerLager.c.o   -c /Users/Bryan/Programmeren/exercises/C/week1/hogerLager.c

CMakeFiles/hogerLager.dir/hogerLager.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/hogerLager.dir/hogerLager.c.i"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc  $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/Bryan/Programmeren/exercises/C/week1/hogerLager.c > CMakeFiles/hogerLager.dir/hogerLager.c.i

CMakeFiles/hogerLager.dir/hogerLager.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/hogerLager.dir/hogerLager.c.s"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc  $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/Bryan/Programmeren/exercises/C/week1/hogerLager.c -o CMakeFiles/hogerLager.dir/hogerLager.c.s

CMakeFiles/hogerLager.dir/hogerLager.c.o.requires:

.PHONY : CMakeFiles/hogerLager.dir/hogerLager.c.o.requires

CMakeFiles/hogerLager.dir/hogerLager.c.o.provides: CMakeFiles/hogerLager.dir/hogerLager.c.o.requires
	$(MAKE) -f CMakeFiles/hogerLager.dir/build.make CMakeFiles/hogerLager.dir/hogerLager.c.o.provides.build
.PHONY : CMakeFiles/hogerLager.dir/hogerLager.c.o.provides

CMakeFiles/hogerLager.dir/hogerLager.c.o.provides.build: CMakeFiles/hogerLager.dir/hogerLager.c.o


# Object files for target hogerLager
hogerLager_OBJECTS = \
"CMakeFiles/hogerLager.dir/hogerLager.c.o"

# External object files for target hogerLager
hogerLager_EXTERNAL_OBJECTS =

hogerLager: CMakeFiles/hogerLager.dir/hogerLager.c.o
hogerLager: CMakeFiles/hogerLager.dir/build.make
hogerLager: CMakeFiles/hogerLager.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable hogerLager"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/hogerLager.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/hogerLager.dir/build: hogerLager

.PHONY : CMakeFiles/hogerLager.dir/build

CMakeFiles/hogerLager.dir/requires: CMakeFiles/hogerLager.dir/hogerLager.c.o.requires

.PHONY : CMakeFiles/hogerLager.dir/requires

CMakeFiles/hogerLager.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/hogerLager.dir/cmake_clean.cmake
.PHONY : CMakeFiles/hogerLager.dir/clean

CMakeFiles/hogerLager.dir/depend:
	cd /Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/Bryan/Programmeren/exercises/C/week1 /Users/Bryan/Programmeren/exercises/C/week1 /Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug /Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug /Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug/CMakeFiles/hogerLager.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/hogerLager.dir/depend

