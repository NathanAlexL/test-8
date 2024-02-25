import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ConnexionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Récupération des données du formulaire
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        // Vérification des informations de connexion (remplacez ceci par votre logique de vérification réelle)
        if ("email@example.com".equals(email) && "motdepasse".equals(password)) {
            // Connexion réussie, rediriger l'utilisateur vers une page de succès
            response.sendRedirect("connexion_reussie.html");
        } else {
            // Informations de connexion incorrectes, afficher un message d'erreur
            out.println("<h1>Connexion échouée</h1>");
            out.println("<p>Les informations de connexion sont incorrectes. Veuillez réessayer.</p>");
        }
    }
}
