# CFGVisualization 

[![build-status](https://travis-ci.org/CharlesZ-Chen/CFGVisualization.svg?branch=master)](https://travis-ci.org/CharlesZ-Chen/CFGVisualization)

Control Flow Graph Visualization for Checker Framework

#Requirement

This project depends on following projects:

https://bitbucket.org/typetools/jsr308-langtools

https://github.com/typetools/annotation-tools

https://github.com/wmdietl/checker-framework

To build the example and generate PDFs, you will need `dot` installed on your machine.

TODO: add auto-install `dot` script in travis-build-without-test.sh.

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
