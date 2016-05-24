# CFGVisualization ![](https://travis-ci.org/CharlesZ-Chen/CFGVisualization.svg?branch=master)
Control Flow Graph Visualization for Checker Framework

#Requirement

This project depends on following projects:

https://bitbucket.org/typetools/jsr308-langtools

https://github.com/typetools/annotation-tools

https://github.com/wmdietl/checker-framework

#Building

First create a root dir for this projects and its dependences. (mine called `jsr308`).

In the root dir, clone this project. In the clone, run `setup.sh`.

#Example

There is an `example` directory in the CFGVisualization. After building, you could run this example by:

  ```
  cd CFGVisualization/example
  make
  ```
  
It will generate four kinds of CFGVisualization of method m ( ) in M.java, the pdf could be found in `pdfs` directory.

The according dotfiles are generated in accroding directories. The `dofiles_default` is analzed by the default DOTCFGVisualizer in the checkerframwork project.
