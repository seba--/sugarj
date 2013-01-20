package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Ext$Op$Decl_2_0 extends Strategy 
{ 
  public static $Ext$Op$Decl_2_0 instance = new $Ext$Op$Decl_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_47, Strategy q_47)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtOpDecl_2_0");
    Fail351:
    { 
      IStrategoTerm r_194 = null;
      IStrategoTerm p_194 = null;
      IStrategoTerm q_194 = null;
      IStrategoTerm s_194 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExtOpDecl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail351;
      p_194 = term.getSubterm(0);
      q_194 = term.getSubterm(1);
      IStrategoList annos295 = term.getAnnotations();
      r_194 = annos295;
      term = p_47.invoke(context, p_194);
      if(term == null)
        break Fail351;
      s_194 = term;
      term = q_47.invoke(context, q_194);
      if(term == null)
        break Fail351;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExtOpDecl_2, new IStrategoTerm[]{s_194, term}), checkListAnnos(termFactory, r_194));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}