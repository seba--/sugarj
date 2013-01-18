package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Ext$Op$Decl$Inj_1_0 extends Strategy 
{ 
  public static $Ext$Op$Decl$Inj_1_0 instance = new $Ext$Op$Decl$Inj_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_47)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtOpDeclInj_1_0");
    Fail349:
    { 
      IStrategoTerm i_194 = null;
      IStrategoTerm h_194 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExtOpDeclInj_1 != ((IStrategoAppl)term).getConstructor())
        break Fail349;
      h_194 = term.getSubterm(0);
      IStrategoList annos293 = term.getAnnotations();
      i_194 = annos293;
      term = m_47.invoke(context, h_194);
      if(term == null)
        break Fail349;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExtOpDeclInj_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_194));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}