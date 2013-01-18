package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Op$Decl$Inj_1_0 extends Strategy 
{ 
  public static $Op$Decl$Inj_1_0 instance = new $Op$Decl$Inj_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_47)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpDeclInj_1_0");
    Fail352:
    { 
      IStrategoTerm v_194 = null;
      IStrategoTerm u_194 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOpDeclInj_1 != ((IStrategoAppl)term).getConstructor())
        break Fail352;
      u_194 = term.getSubterm(0);
      IStrategoList annos296 = term.getAnnotations();
      v_194 = annos296;
      term = r_47.invoke(context, u_194);
      if(term == null)
        break Fail352;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOpDeclInj_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_194));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}