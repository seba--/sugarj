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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_26, IStrategoTerm u_26, IStrategoTerm v_26)
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
            IStrategoTerm y_13 = null;
            IStrategoTerm z_13 = null;
            IStrategoTerm a_14 = null;
            IStrategoTerm b_14 = null;
            y_13 = term.getSubterm(0);
            IStrategoTerm arg0 = term.getSubterm(1);
            if(arg0.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg0).getConstructor())
              break Fail2;
            if(arg0.getSubterm(0) != u_26 && !u_26.match(arg0.getSubterm(0)))
              break Fail2;
            z_13 = term.getSubterm(2);
            a_14 = term.getSubterm(3);
            b_14 = term.getSubterm(4);
            term = termFactory.makeAppl(renaming._consClassDecHead_5, new IStrategoTerm[]{y_13, termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{v_26}), z_13, a_14, b_14});
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
              IStrategoTerm s_13 = null;
              IStrategoTerm t_13 = null;
              IStrategoTerm u_13 = null;
              s_13 = term.getSubterm(0);
              IStrategoTerm arg1 = term.getSubterm(1);
              if(arg1.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg1).getConstructor())
                break Fail3;
              if(arg1.getSubterm(0) != u_26 && !u_26.match(arg1.getSubterm(0)))
                break Fail3;
              t_13 = term.getSubterm(2);
              u_13 = term.getSubterm(3);
              term = termFactory.makeAppl(renaming._consInterfaceDecHead_4, new IStrategoTerm[]{s_13, termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{v_26}), t_13, u_13});
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
                IStrategoTerm n_13 = null;
                IStrategoTerm o_13 = null;
                n_13 = term.getSubterm(0);
                IStrategoTerm arg2 = term.getSubterm(1);
                if(arg2.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg2).getConstructor())
                  break Fail4;
                if(arg2.getSubterm(0) != u_26 && !u_26.match(arg2.getSubterm(0)))
                  break Fail4;
                o_13 = term.getSubterm(2);
                term = termFactory.makeAppl(renaming._consEnumDecHead_3, new IStrategoTerm[]{n_13, termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{v_26}), o_13});
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
                  IStrategoTerm j_13 = null;
                  j_13 = term.getSubterm(0);
                  IStrategoTerm arg3 = term.getSubterm(1);
                  if(arg3.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg3).getConstructor())
                    break Fail5;
                  if(arg3.getSubterm(0) != u_26 && !u_26.match(arg3.getSubterm(0)))
                    break Fail5;
                  term = termFactory.makeAppl(renaming._consAnnoDecHead_2, new IStrategoTerm[]{j_13, termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{v_26})});
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
                    IStrategoTerm c_13 = null;
                    IStrategoTerm d_13 = null;
                    IStrategoTerm e_13 = null;
                    IStrategoTerm f_13 = null;
                    c_13 = term.getSubterm(0);
                    d_13 = term.getSubterm(1);
                    IStrategoTerm arg4 = term.getSubterm(2);
                    if(arg4.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg4).getConstructor())
                      break Fail6;
                    if(arg4.getSubterm(0) != u_26 && !u_26.match(arg4.getSubterm(0)))
                      break Fail6;
                    e_13 = term.getSubterm(3);
                    f_13 = term.getSubterm(4);
                    term = termFactory.makeAppl(renaming._consConstrDecHead_5, new IStrategoTerm[]{c_13, d_13, termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{v_26}), e_13, f_13});
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
                      if(arg5.getSubterm(0) != u_26 && !u_26.match(arg5.getSubterm(0)))
                        break Fail7;
                      term = termFactory.makeAppl(renaming._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{v_26})});
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
                        IStrategoTerm u_12 = null;
                        u_12 = term.getSubterm(0);
                        IStrategoTerm arg6 = term.getSubterm(1);
                        if(arg6.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg6).getConstructor())
                          break Fail8;
                        if(arg6.getSubterm(0) != u_26 && !u_26.match(arg6.getSubterm(0)))
                          break Fail8;
                        term = termFactory.makeTuple(t_26, u_12);
                        term = match_pkgs_java_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail8;
                        term = termFactory.makeAppl(renaming._consTypeName_2, new IStrategoTerm[]{u_12, termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{v_26})});
                        if(true)
                          break Success6;
                      }
                      term = term0;
                    }
                    if(cons0 == renaming._consAmbName_1)
                    { 
                      IStrategoTerm arg7 = term.getSubterm(0);
                      if(arg7.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg7).getConstructor())
                        break Fail1;
                      if(arg7.getSubterm(0) != u_26 && !u_26.match(arg7.getSubterm(0)))
                        break Fail1;
                      term = termFactory.makeAppl(renaming._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{v_26})});
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
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}