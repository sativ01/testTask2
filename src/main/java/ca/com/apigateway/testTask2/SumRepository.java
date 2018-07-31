package ca.com.apigateway.testTask2;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "sums", path = "sums")
public interface SumRepository extends PagingAndSortingRepository<Sum, Long> { }