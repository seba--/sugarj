package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class match_pkgs_java_0_0 extends Strategy 
{ 
  public static match_pkgs_java_0_0 instance = new match_pkgs_java_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("match_pkgs_java_0_0");
    Fail21:
    { 
      IStrategoTerm term13 = term;
      Success13:
      { 
        Fail22:
        { 
          IStrategoTerm i_26 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail22;
          IStrategoTerm arg13 = term.getSubterm(0);
          if(arg13.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg13).isEmpty())
            break Fail22;
          i_26 = ((IStrategoList)arg13).head();
          IStrategoTerm arg14 = ((IStrategoList)arg13).tail();
          if(arg14.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg14).isEmpty())
            break Fail22;
          IStrategoTerm arg15 = term.getSubterm(1);
          if(arg15.getTermType() != IStrategoTerm.APPL || out._consPackageOrTypeName_1 != ((IStrategoAppl)arg15).getConstructor())
            break Fail22;
          IStrategoTerm arg16 = arg15.getSubterm(0);
          if(arg16.getTermType() != IStrategoTerm.APPL || out._consId_1 != ((IStrategoAppl)arg16).getConstructor())
            break Fail22;
          if(arg16.getSubterm(0) != i_26 && !i_26.match(arg16.getSubterm(0)))
            break Fail22;
          if(true)
            break Success13;
        }
        term = term13;
        IStrategoTerm d_26 = null;
        IStrategoTerm e_26 = null;
        IStrategoTerm f_26 = null;
        IStrategoTerm g_26 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail21;
        e_26 = term.getSubterm(0);
        IStrategoTerm arg17 = term.getSubterm(1);
        if(arg17.getTermType() != IStrategoTerm.APPL || out._consPackageOrTypeName_2 != ((IStrategoAppl)arg17).getConstructor())
          break Fail21;
        d_26 = arg17.getSubterm(0);
        IStrategoTerm arg18 = arg17.getSubterm(1);
        if(arg18.getTermType() != IStrategoTerm.APPL || out._consId_1 != ((IStrategoAppl)arg18).getConstructor())
          break Fail21;
        g_26 = arg18.getSubterm(0);
        term = split_last_0_0.instance.invoke(context, e_26);
        if(term == null)
          break Fail21;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail21;
        f_26 = term.getSubterm(0);
        if(term.getSubterm(1) != g_26 && !g_26.match(term.getSubterm(1)))
          break Fail21;
        term = termFactory.makeTuple(f_26, d_26);
        term = this.invoke(context, term);
        if(term == null)
          break Fail21;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}