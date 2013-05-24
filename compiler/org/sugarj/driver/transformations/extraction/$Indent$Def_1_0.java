package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Indent$Def_1_0 extends Strategy 
{ 
  public static $Indent$Def_1_0 instance = new $Indent$Def_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_338)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IndentDef_1_0");
    Fail840:
    { 
      IStrategoTerm i_437 = null;
      IStrategoTerm h_437 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consIndentDef_1 != ((IStrategoAppl)term).getConstructor())
        break Fail840;
      h_437 = term.getSubterm(0);
      IStrategoList annos87 = term.getAnnotations();
      i_437 = annos87;
      term = x_338.invoke(context, h_437);
      if(term == null)
        break Fail840;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consIndentDef_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_437));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}