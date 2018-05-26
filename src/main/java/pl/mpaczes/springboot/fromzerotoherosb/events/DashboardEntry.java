package pl.mpaczes.springboot.fromzerotoherosb.events;

import java.util.List;

import pl.mpaczes.springboot.fromzerotoherosb.github.RepositoryEvent;

public class DashboardEntry {

	private final GithubProject project;

	private final List<RepositoryEvent> events;

	public DashboardEntry(GithubProject project, List<RepositoryEvent> events) {
		this.project = project;
		this.events = events;
	}

	public GithubProject getProject() {
		return project;
	}

	public List<RepositoryEvent> getEvents() {
		return events;
	}
	
}
