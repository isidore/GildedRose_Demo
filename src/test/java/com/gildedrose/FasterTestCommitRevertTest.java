//package com.gildedrose;
//
//import org.approvaltests.testcommitrevert.GitCommitOrRevert;
//import org.approvaltests.testcommitrevert.TestCommitRevertTest;
//
//import com.spun.util.ObjectUtils;
//import com.spun.util.io.FileUtils;
//
//public class FasterTestCommitRevertTest extends TestCommitRevertTest
//{
//  static
//  {
//    GitCommitOrRevert.askForCommitMessage = () -> {
//      try
//      {
//        Process exec = Runtime.getRuntime().exec("osascript /Users/llewellyn/Dialog.scpt");
//        exec.waitFor();
//        return FileUtils.readStream(exec.getInputStream());
//      }
//      catch (Exception e)
//      {
//        throw ObjectUtils.throwAsError(e);
//      }
//    };
//  }
//}
