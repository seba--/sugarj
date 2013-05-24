package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Op$Decl_2_0 extends Strategy 
{ 
  public static $Op$Decl_2_0 instance = new $Op$Decl_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_345, Strategy x_345)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpDecl_2_0");
    Fail950:
    { 
      IStrategoTerm j_455 = null;
      IStrategoTerm h_455 = null;
      IStrategoTerm i_455 = null;
      IStrategoTerm k_455 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consOpDecl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail950;
      h_455 = term.getSubterm(0);
      i_455 = term.getSubterm(1);
      IStrategoList annos193 = term.getAnnotations();
      j_455 = annos193;
      term = w_345.invoke(context, h_455);
      if(term == null)
        break Fail950;
      k_455 = term;
      term = x_345.invoke(context, i_455);
      if(term == null)
        break Fail950;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consOpDecl_2, new IStrategoTerm[]{k_455, term}), checkListAnnos(termFactory, j_455));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}