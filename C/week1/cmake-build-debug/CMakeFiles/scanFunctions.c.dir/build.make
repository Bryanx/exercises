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
include CMakeFiles/scanFunctions.c.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/scanFunctions.c.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/scanFunctions.c.dir/flags.make

CMakeFiles/scanFunctions.c.dir/scanFunctions.c.o: CMakeFiles/scanFunctions.c.dir/flags.make
CMakeFiles/scanFunctions.c.dir/scanFunctions.c.o: ../scanFunctions.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/scanFunctions.c.dir/scanFunctions.c.o"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc  $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/scanFunctions.c.dir/scanFunctions.c.o   -c /Users/Bryan/Programmeren/exercises/C/week1/scanFunctions.c

CMakeFiles/scanFunctions.c.dir/scanFunctions.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/scanFunctions.c.dir/scanFunctions.c.i"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc  $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/Bryan/Programmeren/exercises/C/week1/scanFunctions.c > CMakeFiles/scanFunctions.c.dir/scanFunctions.c.i

CMakeFiles/scanFunctions.c.dir/scanFunctions.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/scanFunctions.c.dir/scanFunctions.c.s"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc  $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/Bryan/Programmeren/exercises/C/week1/scanFunctions.c -o CMakeFiles/scanFunctions.c.dir/scanFunctions.c.s

CMakeFiles/scanFunctions.c.dir/scanFunctions.c.o.requires:

.PHONY : CMakeFiles/scanFunctions.c.dir/scanFunctions.c.o.requires

CMakeFiles/scanFunctions.c.dir/scanFunctions.c.o.provides: CMakeFiles/scanFunctions.c.dir/scanFunctions.c.o.requires
	$(MAKE) -f CMakeFiles/scanFunctions.c.dir/build.make CMakeFiles/scanFunctions.c.dir/scanFunctions.c.o.provides.build
.PHONY : CMakeFiles/scanFunctions.c.dir/scanFunctions.c.o.provides

CMakeFiles/scanFunctions.c.dir/scanFunctions.c.o.provides.build: CMakeFiles/scanFunctions.c.dir/scanFunctions.c.o


# Object files for target scanFunctions.c
scanFunctions_c_OBJECTS = \
"CMakeFiles/scanFunctions.c.dir/scanFunctions.c.o"

# External object files for target scanFunctions.c
scanFunctions_c_EXTERNAL_OBJECTS =

scanFunctions.c: CMakeFiles/scanFunctions.c.dir/scanFunctions.c.o
scanFunctions.c: CMakeFiles/scanFunctions.c.dir/build.make
scanFunctions.c: CMakeFiles/scanFunctions.c.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable scanFunctions.c"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/scanFunctions.c.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/scanFunctions.c.dir/build: scanFunctions.c

.PHONY : CMakeFiles/scanFunctions.c.dir/build

CMakeFiles/scanFunctions.c.dir/requires: CMakeFiles/scanFunctions.c.dir/scanFunctions.c.o.requires

.PHONY : CMakeFiles/scanFunctions.c.dir/requires

CMakeFiles/scanFunctions.c.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/scanFunctions.c.dir/cmake_clean.cmake
.PHONY : CMakeFiles/scanFunctions.c.dir/clean

CMakeFiles/scanFunctions.c.dir/depend:
	cd /Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/Bryan/Programmeren/exercises/C/week1 /Users/Bryan/Programmeren/exercises/C/week1 /Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug /Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug /Users/Bryan/Programmeren/exercises/C/week1/cmake-build-debug/CMakeFiles/scanFunctions.c.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/scanFunctions.c.dir/depend
