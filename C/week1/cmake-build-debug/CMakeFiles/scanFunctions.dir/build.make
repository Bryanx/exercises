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
include CMakeFiles/scanFunctions.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/scanFunctions.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/scanFunctions.dir/flags.make

CMakeFiles/scanFunctions.dir/scanFunctions.c.o: CMakeFiles/scanFunctions.dir/flags.make
CMakeFiles/scanFunctions.dir/scanFunctions.c.o: ../scanFunctions.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/scanFunctions.dir/scanFunctions.c.o"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc  $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/scanFunctions.dir/scanFunctions.c.o   -c /Users/Bryan/Programmeren/exercises/C/week1/scanFunctions.c

CMakeFiles/scanFunctions.dir/scanFunctions.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/scanFunctions.dir/scanFunctions.c.i"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc  $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/Bryan/Programmeren/exercises/C/week1/scanFunctions.c > CMakeFiles/scanFunctions.dir/scanFunctions.c.i

CMakeFiles/scanFunctions.dir/scanFunctions.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/scanFunctions.dir/scanFunctions.c.s"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc  $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/Bryan/Programmeren/exercises/C/week1/scanFunctions.c -o CMakeFiles/scanFunctions.dir/scanFunctions.c.s

CMakeFiles/scanFunctions.dir/scanFunctions.c.o.requires:

.PHONY : CMakeFiles/scanFunctions.dir/scanFunctions.c.o.requires

CMakeFiles/scanFunctions.dir/scanFunctions.c.o.provides: CMakeFiles/scanFunctions.dir/scanFunctions.c.o.requires
	$(MAKE) -f CMakeFiles/scanFunctions.dir/build.make CMakeFiles/scanFunctions.dir/scanFunctions.c.o.provides.build
.PHONY : CMakeFiles/scanFunctions.dir/scanFunctions.c.o.provides

CMakeFiles/scanFunctions.dir/scanFunctions.c.o.provides.build: CMakeFiles/scanFunctions.dir/scanFunctions.c.o


# Object files for target scanFunctions
scanFunctions_OBJECTS = \
"CMakeFiles/scanFunctions.dir/scanFunctions.c.o"

# External object files for target scanFunctions
scanFunctions_EXTERNAL_OBJECTS =

scanFunctions: CMakeFiles/scanFunctions.dir/scanFunctions.c.o
scanFunctions: CMakeFiles/scanFunctions.dir/build.make
scanFunctions: CMakeFiles/scanFunctions.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable scanFunctions"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/scanFunctions.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/scanFunctions.dir/build: scanFunctions

.PHONY : CMakeFiles/scanFunctions.dir/build

CMakeFiles/scanFunctions.dir/requires: CMakeFiles/scanFunctions.dir/scanFunctions.c.o.requires

.PHONY : CMakeFiles/scanFunctions.dir/requires

CMakeFiles/scanFunctions.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/scanFunctions.dir/cmake_clean.cmake
.PHONY : CMakeFiles/scanFunctions.dir/clean

CMakeFiles/scanFunctions.dir/depend:
	cd /Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/Bryan/Programmeren/exercises/C/week1 /Users/Bryan/Programmeren/exercises/C/week1 /Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug /Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug /Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug/CMakeFiles/scanFunctions.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/scanFunctions.dir/depend
