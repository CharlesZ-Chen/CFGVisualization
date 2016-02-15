# CFGVisualization
Control Flow Graph Visualization for Checker Framework

#Requirement

This project depends on following projects:

https://bitbucket.org/typetools/jsr308-langtools

https://github.com/typetools/annotation-tools

https://github.com/wmdietl/checker-framework

You'll need environment variables `CHECKERFRAMEWORK`, `JSR308` and `JAVA_HOME`  set up appropriately.

#Building

1. First build the dependences(jsr308-langtools, annotation-tools, checker-framework) by following tutorial:

http://types.cs.washington.edu/checker-framework/current/checker-framework-manual.html#build-source

2. Then clone this project into the `$CHECKERFRAMWORK` directory and build it by:
  
  ```
  cd $CHECKERFRAMWORK/CFGVisualization
  ant
  ```

#Example

There is an `example` directory in the CFGVisualization. After building, you could run this example by:

  ```
  cd CFGVisualization/example
  make
  ```
  
It will generate four kinds of CFGVisualization of method m ( ) in M.java, the pdf could be found in `pdfs` directory.

The according dotfiles are generated in accroding directories. The `dofiles_default` is analzed by the default DOTCFGVisualizer in the checkerframwork project.