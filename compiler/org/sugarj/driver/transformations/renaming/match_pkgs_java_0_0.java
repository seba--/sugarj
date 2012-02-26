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
    Fail9:
    { 
      IStrategoTerm term7 = term;
      Success7:
      { 
        Fail10:
        { 
          IStrategoTerm h_14 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail10;
          IStrategoTerm arg8 = term.getSubterm(0);
          if(arg8.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg8).isEmpty())
            break Fail10;
          h_14 = ((IStrategoList)arg8).head();
          IStrategoTerm arg9 = ((IStrategoList)arg8).tail();
          if(arg9.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg9).isEmpty())
            break Fail10;
          IStrategoTerm arg10 = term.getSubterm(1);
          if(arg10.getTermType() != IStrategoTerm.APPL || renaming._consPackageOrTypeName_1 != ((IStrategoAppl)arg10).getConstructor())
            break Fail10;
          IStrategoTerm arg11 = arg10.getSubterm(0);
          if(arg11.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg11).getConstructor())
            break Fail10;
          if(arg11.getSubterm(0) != h_14 && !h_14.match(arg11.getSubterm(0)))
            break Fail10;
          if(true)
            break Success7;
        }
        term = term7;
        IStrategoTerm c_14 = null;
        IStrategoTerm d_14 = null;
        IStrategoTerm e_14 = null;
        IStrategoTerm f_14 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail9;
        d_14 = term.getSubterm(0);
        IStrategoTerm arg12 = term.getSubterm(1);
        if(arg12.getTermType() != IStrategoTerm.APPL || renaming._consPackageOrTypeName_2 != ((IStrategoAppl)arg12).getConstructor())
          break Fail9;
        c_14 = arg12.getSubterm(0);
        IStrategoTerm arg13 = arg12.getSubterm(1);
        if(arg13.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg13).getConstructor())
          break Fail9;
        e_14 = arg13.getSubterm(0);
        term = split_last_0_0.instance.invoke(context, d_14);
        if(term == null)
          break Fail9;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail9;
        if(term.getSubterm(0) != e_14 && !e_14.match(term.getSubterm(0)))
          break Fail9;
        f_14 = term.getSubterm(1);
        term = termFactory.makeTuple(f_14, c_14);
        term = this.invoke(context, term);
        if(term == null)
          break Fail9;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}