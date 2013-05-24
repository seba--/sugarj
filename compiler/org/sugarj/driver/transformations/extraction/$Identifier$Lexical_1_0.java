package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Identifier$Lexical_1_0 extends Strategy 
{ 
  public static $Identifier$Lexical_1_0 instance = new $Identifier$Lexical_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_335)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IdentifierLexical_1_0");
    Fail771:
    { 
      IStrategoTerm y_428 = null;
      IStrategoTerm x_428 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consIdentifierLexical_1 != ((IStrategoAppl)term).getConstructor())
        break Fail771;
      x_428 = term.getSubterm(0);
      IStrategoList annos37 = term.getAnnotations();
      y_428 = annos37;
      term = n_335.invoke(context, x_428);
      if(term == null)
        break Fail771;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consIdentifierLexical_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_428));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}