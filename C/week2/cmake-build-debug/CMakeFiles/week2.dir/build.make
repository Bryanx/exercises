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
CMAKE_SOURCE_DIR = /Users/Bryan/Programmeren/exercises/C/week2

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/Bryan/Programmeren/exercises/C/week2/cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/week2.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/week2.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/week2.dir/flags.make

CMakeFiles/week2.dir/main.c.o: CMakeFiles/week2.dir/flags.make
CMakeFiles/week2.dir/main.c.o: ../main.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/Bryan/Programmeren/exercises/C/week2/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/week2.dir/main.c.o"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc  $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/week2.dir/main.c.o   -c /Users/Bryan/Programmeren/exercises/C/week2/main.c

CMakeFiles/week2.dir/main.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/week2.dir/main.c.i"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc  $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/Bryan/Programmeren/exercises/C/week2/main.c > CMakeFiles/week2.dir/main.c.i

CMakeFiles/week2.dir/main.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/week2.dir/main.c.s"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc  $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/Bryan/Programmeren/exercises/C/week2/main.c -o CMakeFiles/week2.dir/main.c.s

CMakeFiles/week2.dir/main.c.o.requires:

.PHONY : CMakeFiles/week2.dir/main.c.o.requires

CMakeFiles/week2.dir/main.c.o.provides: CMakeFiles/week2.dir/main.c.o.requires
	$(MAKE) -f CMakeFiles/week2.dir/build.make CMakeFiles/week2.dir/main.c.o.provides.build
.PHONY : CMakeFiles/week2.dir/main.c.o.provides

CMakeFiles/week2.dir/main.c.o.provides.build: CMakeFiles/week2.dir/main.c.o


# Object files for target week2
week2_OBJECTS = \
"CMakeFiles/week2.dir/main.c.o"

# External object files for target week2
week2_EXTERNAL_OBJECTS =

week2: CMakeFiles/week2.dir/main.c.o
week2: CMakeFiles/week2.dir/build.make
week2: CMakeFiles/week2.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/Bryan/Programmeren/exercises/C/week2/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable week2"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/week2.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/week2.dir/build: week2

.PHONY : CMakeFiles/week2.dir/build

CMakeFiles/week2.dir/requires: CMakeFiles/week2.dir/main.c.o.requires

.PHONY : CMakeFiles/week2.dir/requires

CMakeFiles/week2.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/week2.dir/cmake_clean.cmake
.PHONY : CMakeFiles/week2.dir/clean

CMakeFiles/week2.dir/depend:
	cd /Users/Bryan/Programmeren/exercises/C/week2/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/Bryan/Programmeren/exercises/C/week2 /Users/Bryan/Programmeren/exercises/C/week2 /Users/Bryan/Programmeren/exercises/C/week2/cmake-build-debug /Users/Bryan/Programmeren/exercises/C/week2/cmake-build-debug /Users/Bryan/Programmeren/exercises/C/week2/cmake-build-debug/CMakeFiles/week2.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/week2.dir/depend

