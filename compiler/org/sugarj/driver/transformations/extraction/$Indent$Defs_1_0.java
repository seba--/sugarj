package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Indent$Defs_1_0 extends Strategy 
{ 
  public static $Indent$Defs_1_0 instance = new $Indent$Defs_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_338)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IndentDefs_1_0");
    Fail836:
    { 
      IStrategoTerm t_436 = null;
      IStrategoTerm s_436 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consIndentDefs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail836;
      s_436 = term.getSubterm(0);
      IStrategoList annos84 = term.getAnnotations();
      t_436 = annos84;
      term = q_338.invoke(context, s_436);
      if(term == null)
        break Fail836;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consIndentDefs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_436));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}