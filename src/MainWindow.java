import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;

public class MainWindow {
	private JFrame frmSistema;
	private Controlador controlador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow(new Controlador());
					window.frmSistema.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow(Controlador controlador) {
		initialize(controlador);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Controlador controlador) {
		frmSistema = new JFrame();
		frmSistema.setTitle("Sistema");
		frmSistema.setBounds(100, 100, 450, 300);
		frmSistema.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSistema.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));

		JMenuBar menuBar = new JMenuBar();
		frmSistema.setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Cadastro");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Aluno");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Aluno seria cadastrado no banco de dados, mas isso não deve ser definido
				// nesta etapa do projeto.
				JOptionPane.showMessageDialog(null, new Aluno());
			}
		});
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Avaliação");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						controlador.adicionarAvaliacao(new Aula(LocalDate.now(), 80), new Aluno(), new float[] { 5 }));
				// Tratamento a ser feito em partes mais posteriores do projeto:
				// utilizar o retorno booleano de controlador.adicionarAvaliacao
				// true -> Avaliação foi adicionada com sucesso
				// false -> Ocorreu um erro ao tentar adicionar a avaliação
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Professor");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, new Professor(LocalDate.now()));
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);

		JMenu mnNewMenu_1 = new JMenu("Contato");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Mandar mensagem");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Materia materia = new Materia("Engenharia de Software");
				// O retorno booleano abaixo representa o sucesso do envio da mensagem.
				JOptionPane.showMessageDialog(null, controlador.enviarMensagem("Titulo", "Conteúdo", materia));
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Visualizar mensagem");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensagem[] = controlador.lerMensagem(new Mensagem("Titulo", "Conteúdo", LocalDate.now()));
				JOptionPane.showMessageDialog(null, String.format("%s\n%s", mensagem[0], mensagem[1]));
				// Mostra título e conteúdo da mensagem em um MessageDialog
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);

		JMenu mnNewMenu_2 = new JMenu("Atividades");
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Agendar aula");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						controlador.agendarAula(LocalDate.now(), 120, new Materia("Engenharia de Software")));
			}
			// controlador.agendarAula retorna um booleano indicando sucesso (ou falha) no
			// agendamento
			// de uma nova aula.
		});
		mnNewMenu_2.add(mntmNewMenuItem_5);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Corrigir avaliação");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						controlador.corrigirAvaliacao(new Aula(LocalDate.now(), 100), new Aluno(), new float[] { 5 }));
				// controlador.corrigirAvaliacao cria uma nova instância de Avaliacao para o
				// Aluno em determinada aula.
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_6);

		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Concretizar avaliação");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Aqui teria uma lista de materias, mas a implementação de lógica de View
				// não faz parte do escopo desta fase do projeto.
				// Presume-se que a instância de Materia é conhecida.
				controlador.concretizarAvaliacao(new Avaliacao(new float[] { 5 }));
				JOptionPane.showMessageDialog(null, "Ok");
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_7);

		// Caso de uso: Estimar progressão de aluno
		// Utiliza de um algoritmo estatístico ainda não definido para realizar
		// a predição com base nas avaliações anteriores de um aluno em determinada
		// aula.
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Estimar progressão de aluno");
		mnNewMenu_2.add(mntmNewMenuItem_8);

		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Visualizar histórico");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						controlador.historicoAluno(new Materia("Engenharia de Software"), new Aluno()));
				// controlador.historicoAluno retorna uma lista de Avaliacao de um determinado
				// aluno em uma determinada matéria
				// Aqui, assume-se que as instâncias de Matéria e Aluno são conhecidas, pois
				// serão selecionadas a partir da interface
				// que fará uso de uma JList.
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_9);
	}
}
