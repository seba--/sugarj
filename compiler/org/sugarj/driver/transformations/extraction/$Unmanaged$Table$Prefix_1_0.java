package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Unmanaged$Table$Prefix_1_0 extends Strategy 
{ 
  public static $Unmanaged$Table$Prefix_1_0 instance = new $Unmanaged$Table$Prefix_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_338)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("UnmanagedTablePrefix_1_0");
    Fail832:
    { 
      IStrategoTerm h_436 = null;
      IStrategoTerm g_436 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consUnmanagedTablePrefix_1 != ((IStrategoAppl)term).getConstructor())
        break Fail832;
      g_436 = term.getSubterm(0);
      IStrategoList annos80 = term.getAnnotations();
      h_436 = annos80;
      term = m_338.invoke(context, g_436);
      if(term == null)
        break Fail832;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consUnmanagedTablePrefix_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_436));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}