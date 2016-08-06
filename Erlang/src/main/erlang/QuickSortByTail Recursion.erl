%%%-------------------------------------------------------------------
%%% @author root
%%% @copyright (C) 2016, <COMPANY>
%%% @doc
%%%
%%% @end
%%% Created : 06. Aug 2016 下午9:25
%%%-------------------------------------------------------------------
-module('QuickSortByTail Recursion').
-author("root").

%% API
-export([]).
%% Factorial
fact(N) -> fact(N, 1).
fact(0, A) -> 1*A;
fact(N, A) -> fact(N-1, N*A).

%% Quick Sort
%% Think thru, you'll see it very easy to understand :p
qsort([]) -> [];
qsort([Single]) -> [Single];
qsort([Pivot|Rest]) ->
  {Smallers, Greaters} = qsort(Pivot, Rest),
  SortedSmallers = qsort(Smallers),
  SortedGreaters = qsort(Greaters),
  SortedSmallers ++ [Pivot] ++ SortedGreaters.

qsort(Pivot, List) -> qsort(Pivot, [], [], List).

qsort(_Pivot, Smallers, Greaters, []) -> {Smallers, Greaters};
qsort(Pivot, Smallers, Greaters, [First|Rest]) when First < Pivot ->
  qsort(Pivot, [First|Smallers], Greaters, Rest);
qsort(Pivot, Smallers, Greaters, [First|Rest]) when First >= Pivot ->
  qsort(Pivot, Smallers, [First|Greaters], Rest).

%% Loop
%% Just a sample, don't run!!!
loop() ->
  receive
    {status, ok} ->
      loop()
  end.