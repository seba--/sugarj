package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class do_rename_java_0_3 extends Strategy 
{ 
  public static do_rename_java_0_3 instance = new do_rename_java_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_27, IStrategoTerm c_27, IStrategoTerm d_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("do_rename_java_0_3");
    Fail1:
    { 
      IStrategoTerm term0 = term;
      IStrategoConstructor cons0 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success0:
      { 
        if(cons0 == renaming._consClassDecHead_5)
        { 
          Fail2:
          { 
            IStrategoTerm g_14 = null;
            IStrategoTerm h_14 = null;
            IStrategoTerm i_14 = null;
            IStrategoTerm j_14 = null;
            g_14 = term.getSubterm(0);
            IStrategoTerm arg0 = term.getSubterm(1);
            if(arg0.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg0).getConstructor())
              break Fail2;
            if(arg0.getSubterm(0) != c_27 && !c_27.match(arg0.getSubterm(0)))
              break Fail2;
            h_14 = term.getSubterm(2);
            i_14 = term.getSubterm(3);
            j_14 = term.getSubterm(4);
            term = termFactory.makeAppl(renaming._consClassDecHead_5, new IStrategoTerm[]{g_14, termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{d_27}), h_14, i_14, j_14});
            if(true)
              break Success0;
          }
          term = term0;
        }
        Success1:
        { 
          if(cons0 == renaming._consInterfaceDecHead_4)
          { 
            Fail3:
            { 
              IStrategoTerm a_14 = null;
              IStrategoTerm b_14 = null;
              IStrategoTerm c_14 = null;
              a_14 = term.getSubterm(0);
              IStrategoTerm arg1 = term.getSubterm(1);
              if(arg1.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg1).getConstructor())
                break Fail3;
              if(arg1.getSubterm(0) != c_27 && !c_27.match(arg1.getSubterm(0)))
                break Fail3;
              b_14 = term.getSubterm(2);
              c_14 = term.getSubterm(3);
              term = termFactory.makeAppl(renaming._consInterfaceDecHead_4, new IStrategoTerm[]{a_14, termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{d_27}), b_14, c_14});
              if(true)
                break Success1;
            }
            term = term0;
          }
          Success2:
          { 
            if(cons0 == renaming._consEnumDecHead_3)
            { 
              Fail4:
              { 
                IStrategoTerm v_13 = null;
                IStrategoTerm w_13 = null;
                v_13 = term.getSubterm(0);
                IStrategoTerm arg2 = term.getSubterm(1);
                if(arg2.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg2).getConstructor())
                  break Fail4;
                if(arg2.getSubterm(0) != c_27 && !c_27.match(arg2.getSubterm(0)))
                  break Fail4;
                w_13 = term.getSubterm(2);
                term = termFactory.makeAppl(renaming._consEnumDecHead_3, new IStrategoTerm[]{v_13, termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{d_27}), w_13});
                if(true)
                  break Success2;
              }
              term = term0;
            }
            Success3:
            { 
              if(cons0 == renaming._consAnnoDecHead_2)
              { 
                Fail5:
                { 
                  IStrategoTerm r_13 = null;
                  r_13 = term.getSubterm(0);
                  IStrategoTerm arg3 = term.getSubterm(1);
                  if(arg3.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg3).getConstructor())
                    break Fail5;
                  if(arg3.getSubterm(0) != c_27 && !c_27.match(arg3.getSubterm(0)))
                    break Fail5;
                  term = termFactory.makeAppl(renaming._consAnnoDecHead_2, new IStrategoTerm[]{r_13, termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{d_27})});
                  if(true)
                    break Success3;
                }
                term = term0;
              }
              Success4:
              { 
                if(cons0 == renaming._consConstrDecHead_5)
                { 
                  Fail6:
                  { 
                    IStrategoTerm k_13 = null;
                    IStrategoTerm l_13 = null;
                    IStrategoTerm m_13 = null;
                    IStrategoTerm n_13 = null;
                    k_13 = term.getSubterm(0);
                    l_13 = term.getSubterm(1);
                    IStrategoTerm arg4 = term.getSubterm(2);
                    if(arg4.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg4).getConstructor())
                      break Fail6;
                    if(arg4.getSubterm(0) != c_27 && !c_27.match(arg4.getSubterm(0)))
                      break Fail6;
                    m_13 = term.getSubterm(3);
                    n_13 = term.getSubterm(4);
                    term = termFactory.makeAppl(renaming._consConstrDecHead_5, new IStrategoTerm[]{k_13, l_13, termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{d_27}), m_13, n_13});
                    if(true)
                      break Success4;
                  }
                  term = term0;
                }
                Success5:
                { 
                  if(cons0 == renaming._consTypeName_1)
                  { 
                    Fail7:
                    { 
                      IStrategoTerm arg5 = term.getSubterm(0);
                      if(arg5.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg5).getConstructor())
                        break Fail7;
                      if(arg5.getSubterm(0) != c_27 && !c_27.match(arg5.getSubterm(0)))
                        break Fail7;
                      term = termFactory.makeAppl(renaming._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{d_27})});
                      if(true)
                        break Success5;
                    }
                    term = term0;
                  }
                  Success6:
                  { 
                    if(cons0 == renaming._consTypeName_2)
                    { 
                      Fail8:
                      { 
                        IStrategoTerm c_13 = null;
                        c_13 = term.getSubterm(0);
                        IStrategoTerm arg6 = term.getSubterm(1);
                        if(arg6.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg6).getConstructor())
                          break Fail8;
                        if(arg6.getSubterm(0) != c_27 && !c_27.match(arg6.getSubterm(0)))
                          break Fail8;
                        term = termFactory.makeTuple(b_27, c_13);
                        term = match_pkgs_java_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail8;
                        term = termFactory.makeAppl(renaming._consTypeName_2, new IStrategoTerm[]{c_13, termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{d_27})});
                        if(true)
                          break Success6;
                      }
                      term = term0;
                    }
                    Success7:
                    { 
                      if(cons0 == renaming._consPackageOrTypeName_1)
                      { 
                        Fail9:
                        { 
                          IStrategoTerm arg7 = term.getSubterm(0);
                          if(arg7.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg7).getConstructor())
                            break Fail9;
                          if(arg7.getSubterm(0) != c_27 && !c_27.match(arg7.getSubterm(0)))
                            break Fail9;
                          term = termFactory.makeAppl(renaming._consPackageOrTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{d_27})});
                          if(true)
                            break Success7;
                        }
                        term = term0;
                      }
                      Success8:
                      { 
                        if(cons0 == renaming._consPackageOrTypeName_2)
                        { 
                          Fail10:
                          { 
                            IStrategoTerm u_12 = null;
                            u_12 = term.getSubterm(0);
                            IStrategoTerm arg8 = term.getSubterm(1);
                            if(arg8.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg8).getConstructor())
                              break Fail10;
                            if(arg8.getSubterm(0) != c_27 && !c_27.match(arg8.getSubterm(0)))
                              break Fail10;
                            term = termFactory.makeTuple(b_27, u_12);
                            term = match_pkgs_java_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail10;
                            term = termFactory.makeAppl(renaming._consPackageOrTypeName_2, new IStrategoTerm[]{u_12, termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{d_27})});
                            if(true)
                              break Success8;
                          }
                          term = term0;
                        }
                        if(cons0 == renaming._consAmbName_1)
                        { 
                          IStrategoTerm arg9 = term.getSubterm(0);
                          if(arg9.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg9).getConstructor())
                            break Fail1;
                          if(arg9.getSubterm(0) != c_27 && !c_27.match(arg9.getSubterm(0)))
                            break Fail1;
                          term = termFactory.makeAppl(renaming._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{d_27})});
                        }
                        else
                        { 
                          break Fail1;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}