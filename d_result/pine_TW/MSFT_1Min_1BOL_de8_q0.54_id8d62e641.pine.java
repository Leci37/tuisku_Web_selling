//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: MSFT_1Min_1BOL_8d62e641 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_1Min_1BOL_8d62e641", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_1Min_8d62e641(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( dif_source_BBlower <= 1.19445 )
		if( dif_source_BBupper <= -5.36126 )
			if( dif_source_BBupper <= -8.48205 )
				if( dif_source_BBupper <= -36.192 )
					if( BBlower <= 398.013 )
						ret := 0.500000
					if( BBlower > 398.013 )
						ret := 1.000000 // buy
				if( dif_source_BBupper > -36.192 )
					if( BBupper <= 463.149 )
						if( dif_source_BBlower <= -2.61036 )
							if( vrsi <= 73.8244 )
								if( vrsi <= 2.68335 )
									ret := -0.217391
								if( vrsi > 2.68335 )
									ret := 0.664516
							if( vrsi > 73.8244 )
								if( dif_source_BBupper <= -21.1725 )
									ret := -1.000000 // sell
								if( dif_source_BBupper > -21.1725 )
									ret := -0.750000 // sell
						if( dif_source_BBlower > -2.61036 )
							if( dif_source_BBupper <= -21.3012 )
								if( BBlower <= 390.562 )
									ret := 0.133333
								if( BBlower > 390.562 )
									ret := -0.771930 // sell
							if( dif_source_BBupper > -21.3012 )
								if( BBupper <= 447.179 )
									ret := 0.136042
								if( BBupper > 447.179 )
									ret := 0.574468
					if( BBupper > 463.149 )
						if( BBlower <= 455.534 )
							if( BBupper <= 470.65 )
								if( dif_source_BBupper <= -16.8959 )
									ret := 0.000000
								if( dif_source_BBupper > -16.8959 )
									ret := -1.000000 // sell
							if( BBupper > 470.65 )
								if( dif_source_BBupper <= -16.2125 )
									ret := 1.000000 // buy
								if( dif_source_BBupper > -16.2125 )
									ret := 0.142857
						if( BBlower > 455.534 )
							if( BBupper <= 469.197 )
								ret := -1.000000 // sell
							if( BBupper > 469.197 )
								if( dif_source_BBlower <= -1.87415 )
									ret := -0.200000
								if( dif_source_BBlower > -1.87415 )
									ret := -0.958333 // sell
			if( dif_source_BBupper > -8.48205 )
				if( BBupper <= 416.97 )
					if( dif_source_BBupper <= -7.08228 )
						if( BBupper <= 412.623 )
							if( BBlower <= 402.684 )
								if( vrsi <= 50.2476 )
									ret := 0.084112
								if( vrsi > 50.2476 )
									ret := 0.403509
							if( BBlower > 402.684 )
								if( BBupper <= 411.625 )
									ret := -0.580000
								if( BBupper > 411.625 )
									ret := 0.368421
						if( BBupper > 412.623 )
							if( BBupper <= 416.747 )
								if( dif_source_BBupper <= -7.26076 )
									ret := 1.000000 // buy
								if( dif_source_BBupper > -7.26076 )
									ret := 0.791667 // buy
							if( BBupper > 416.747 )
								if( dif_source_BBlower <= -0.313502 )
									ret := 0.000000
								if( dif_source_BBlower > -0.313502 )
									ret := 0.600000
					if( dif_source_BBupper > -7.08228 )
						if( BBlower <= 405.081 )
							if( vrsi <= 18.4433 )
								if( BBlower <= 403.833 )
									ret := -0.302752
								if( BBlower > 403.833 )
									ret := -1.000000 // sell
							if( vrsi > 18.4433 )
								if( BBupper <= 399.269 )
									ret := -0.681818
								if( BBupper > 399.269 )
									ret := 0.043750
						if( BBlower > 405.081 )
							if( vrsi <= 18.8529 )
								if( BBupper <= 412.532 )
									ret := 1.000000 // buy
								if( BBupper > 412.532 )
									ret := 0.239130
							if( vrsi > 18.8529 )
								if( vrsi <= 29.6551 )
									ret := -0.540541
								if( vrsi > 29.6551 )
									ret := 0.186667
				if( BBupper > 416.97 )
					if( vrsi <= 29.0049 )
						if( BBupper <= 430.771 )
							if( vrsi <= 15.2874 )
								if( vrsi <= 11.3967 )
									ret := -0.086538
								if( vrsi > 11.3967 )
									ret := -0.662338
							if( vrsi > 15.2874 )
								if( BBlower <= 418.81 )
									ret := 0.297521
								if( BBlower > 418.81 )
									ret := -0.534884
						if( BBupper > 430.771 )
							if( BBupper <= 440.297 )
								if( dif_source_BBupper <= -6.31421 )
									ret := 0.215385
								if( dif_source_BBupper > -6.31421 )
									ret := 0.610000
							if( BBupper > 440.297 )
								if( vrsi <= 27.4095 )
									ret := -0.114583
								if( vrsi > 27.4095 )
									ret := 0.633333
					if( vrsi > 29.0049 )
						if( dif_source_BBlower <= -0.695822 )
							if( dif_source_BBupper <= -6.10918 )
								if( BBlower <= 429.624 )
									ret := -0.789474 // sell
								if( BBlower > 429.624 )
									ret := -0.352113
							if( dif_source_BBupper > -6.10918 )
								if( BBupper <= 431.307 )
									ret := -0.516129
								if( BBupper > 431.307 )
									ret := 0.230769
						if( dif_source_BBlower > -0.695822 )
							if( dif_source_BBupper <= -6.56066 )
								if( BBlower <= 413.08 )
									ret := 0.267327
								if( BBlower > 413.08 )
									ret := -0.119497
							if( dif_source_BBupper > -6.56066 )
								if( BBlower <= 438.471 )
									ret := -0.341513
								if( BBlower > 438.471 )
									ret := 0.007634
		if( dif_source_BBupper > -5.36126 )
			if( BBupper <= 422.324 )
				if( dif_source_BBlower <= -1.06604 )
					if( vrsi <= 0.617329 )
						ret := -0.400000
					if( vrsi > 0.617329 )
						if( BBupper <= 409.477 )
							ret := 1.000000 // buy
						if( BBupper > 409.477 )
							if( BBupper <= 410.637 )
								ret := 0.000000
							if( BBupper > 410.637 )
								if( BBupper <= 415.858 )
									ret := 1.000000 // buy
								if( BBupper > 415.858 )
									ret := 0.666667
				if( dif_source_BBlower > -1.06604 )
					if( vrsi <= 1.76314 )
						if( dif_source_BBupper <= -4.63653 )
							if( BBlower <= 413.334 )
								if( dif_source_BBupper <= -5.25681 )
									ret := 0.250000
								if( dif_source_BBupper > -5.25681 )
									ret := -0.666667
							if( BBlower > 413.334 )
								if( dif_source_BBlower <= -0.58905 )
									ret := -0.200000
								if( dif_source_BBlower > -0.58905 )
									ret := 0.666667
						if( dif_source_BBupper > -4.63653 )
							if( vrsi <= 0.002623 )
								if( BBupper <= 419.801 )
									ret := 0.287736
								if( BBupper > 419.801 )
									ret := -0.153846
							if( vrsi > 0.002623 )
								if( BBupper <= 415.045 )
									ret := 0.726190 // buy
								if( BBupper > 415.045 )
									ret := 0.333333
					if( vrsi > 1.76314 )
						if( BBlower <= 406.376 )
							if( BBlower <= 404.03 )
								if( BBlower <= 402.229 )
									ret := 0.088994
								if( BBlower > 402.229 )
									ret := -0.156156
							if( BBlower > 404.03 )
								if( dif_source_BBlower <= 0.841746 )
									ret := 0.387046
								if( dif_source_BBlower > 0.841746 )
									ret := 0.150794
						if( BBlower > 406.376 )
							if( BBupper <= 410.882 )
								if( dif_source_BBupper <= -3.02578 )
									ret := -0.484848
								if( dif_source_BBupper > -3.02578 )
									ret := -0.006502
							if( BBupper > 410.882 )
								if( BBupper <= 420.717 )
									ret := 0.077741
								if( BBupper > 420.717 )
									ret := -0.147453
			if( BBupper > 422.324 )
				if( BBlower <= 419.271 )
					if( dif_source_BBlower <= 0.83922 )
						if( vrsi <= 61.9224 )
							if( BBupper <= 423.598 )
								if( BBlower <= 418.321 )
									ret := 0.857143 // buy
								if( BBlower > 418.321 )
									ret := 0.455556
							if( BBupper > 423.598 )
								if( BBlower <= 418.333 )
									ret := 0.875000 // buy
								if( BBlower > 418.333 )
									ret := 1.000000 // buy
						if( vrsi > 61.9224 )
							if( dif_source_BBlower <= 0.431779 )
								if( BBlower <= 419.005 )
									ret := -0.500000
								if( BBlower > 419.005 )
									ret := 0.000000
							if( dif_source_BBlower > 0.431779 )
								ret := 0.142857
					if( dif_source_BBlower > 0.83922 )
						if( dif_source_BBupper <= -4.14333 )
							if( vrsi <= 22.6159 )
								if( dif_source_BBupper <= -4.50728 )
									ret := -0.750000 // sell
								if( dif_source_BBupper > -4.50728 )
									ret := -1.000000 // sell
							if( vrsi > 22.6159 )
								if( dif_source_BBlower <= 1.04787 )
									ret := 0.250000
								if( dif_source_BBlower > 1.04787 )
									ret := -0.130435
						if( dif_source_BBupper > -4.14333 )
							if( dif_source_BBupper <= -3.25166 )
								if( vrsi <= 12.9939 )
									ret := -0.750000 // sell
								if( vrsi > 12.9939 )
									ret := 0.549020
							if( dif_source_BBupper > -3.25166 )
								if( dif_source_BBlower <= 0.986079 )
									ret := -0.714286 // sell
								if( dif_source_BBlower > 0.986079 )
									ret := 0.333333
				if( BBlower > 419.271 )
					if( vrsi <= 10.0647 )
						if( dif_source_BBupper <= -2.73707 )
							if( BBupper <= 423.503 )
								ret := -0.714286 // sell
							if( BBupper > 423.503 )
								if( dif_source_BBlower <= -1.02587 )
									ret := 0.060000
								if( dif_source_BBlower > -1.02587 )
									ret := 0.516355
						if( dif_source_BBupper > -2.73707 )
							if( vrsi <= 8.72925 )
								if( BBlower <= 452.773 )
									ret := 0.273973
								if( BBlower > 452.773 )
									ret := 0.600000
							if( vrsi > 8.72925 )
								if( BBlower <= 421.41 )
									ret := -1.000000 // sell
								if( BBlower > 421.41 )
									ret := 0.074627
					if( vrsi > 10.0647 )
						if( vrsi <= 43.741 )
							if( dif_source_BBupper <= -1.0581 )
								if( vrsi <= 13.7307 )
									ret := -0.039387
								if( vrsi > 13.7307 )
									ret := 0.202130
							if( dif_source_BBupper > -1.0581 )
								if( BBlower <= 440.709 )
									ret := -0.061404
								if( BBlower > 440.709 )
									ret := 0.135849
						if( vrsi > 43.741 )
							if( BBlower <= 428.912 )
								if( vrsi <= 45.8887 )
									ret := -0.142012
								if( vrsi > 45.8887 )
									ret := 0.152967
							if( BBlower > 428.912 )
								if( dif_source_BBupper <= -3.00025 )
									ret := -0.142202
								if( dif_source_BBupper > -3.00025 )
									ret := 0.051473
	if( dif_source_BBlower > 1.19445 )
		if( dif_source_BBupper <= -3.26067 )
			if( BBupper <= 420.888 )
				if( dif_source_BBupper <= -26.4174 )
					if( vrsi <= 54.2192 )
						if( BBupper <= 416.993 )
							ret := 1.000000 // buy
						if( BBupper > 416.993 )
							ret := 0.250000
					if( vrsi > 54.2192 )
						ret := 1.000000 // buy
				if( dif_source_BBupper > -26.4174 )
					if( BBlower <= 407.671 )
						if( BBupper <= 401.553 )
							if( vrsi <= 74.9832 )
								if( BBlower <= 383.465 )
									ret := 0.755814 // buy
								if( BBlower > 383.465 )
									ret := 0.262069
							if( vrsi > 74.9832 )
								if( dif_source_BBupper <= -5.56889 )
									ret := -0.473684
								if( dif_source_BBupper > -5.56889 )
									ret := 0.067416
						if( BBupper > 401.553 )
							if( dif_source_BBlower <= 17.1209 )
								if( dif_source_BBupper <= -3.32933 )
									ret := 0.031978
								if( dif_source_BBupper > -3.32933 )
									ret := 0.400000
							if( dif_source_BBlower > 17.1209 )
								if( vrsi <= 60.4241 )
									ret := 0.136986
								if( vrsi > 60.4241 )
									ret := 0.852941 // buy
					if( BBlower > 407.671 )
						if( vrsi <= 92.2644 )
							if( vrsi <= 59.1064 )
								if( dif_source_BBlower <= 1.31611 )
									ret := -0.048544
								if( dif_source_BBlower > 1.31611 )
									ret := 0.341646
							if( vrsi > 59.1064 )
								if( vrsi <= 72.7134 )
									ret := -0.100000
								if( vrsi > 72.7134 )
									ret := 0.172549
						if( vrsi > 92.2644 )
							if( BBlower <= 409.486 )
								if( vrsi <= 97.5774 )
									ret := 0.910448 // buy
								if( vrsi > 97.5774 )
									ret := 0.200000
							if( BBlower > 409.486 )
								if( BBlower <= 411.741 )
									ret := -0.500000
								if( BBlower > 411.741 )
									ret := 0.483871
			if( BBupper > 420.888 )
				if( dif_source_BBlower <= 25.4258 )
					if( BBupper <= 449.537 )
						if( BBupper <= 444.29 )
							if( BBlower <= 390.633 )
								if( vrsi <= 75.8417 )
									ret := 0.485437
								if( vrsi > 75.8417 )
									ret := -0.208333
							if( BBlower > 390.633 )
								if( BBupper <= 436.094 )
									ret := -0.045864
								if( BBupper > 436.094 )
									ret := 0.160920
						if( BBupper > 444.29 )
							if( dif_source_BBlower <= 3.58274 )
								if( vrsi <= 9.86062 )
									ret := -0.827586 // sell
								if( vrsi > 9.86062 )
									ret := -0.287815
							if( dif_source_BBlower > 3.58274 )
								if( dif_source_BBupper <= -16.5714 )
									ret := 1.000000 // buy
								if( dif_source_BBupper > -16.5714 )
									ret := 0.048387
					if( BBupper > 449.537 )
						if( dif_source_BBupper <= -8.75691 )
							if( BBlower <= 451.132 )
								if( vrsi <= 54.4765 )
									ret := 0.793651 // buy
								if( vrsi > 54.4765 )
									ret := 0.407407
							if( BBlower > 451.132 )
								if( dif_source_BBlower <= 1.92032 )
									ret := -0.391304
								if( dif_source_BBlower > 1.92032 )
									ret := -1.000000 // sell
						if( dif_source_BBupper > -8.75691 )
							if( dif_source_BBlower <= 5.57436 )
								if( BBlower <= 440.911 )
									ret := 0.455882
								if( BBlower > 440.911 )
									ret := 0.016313
							if( dif_source_BBlower > 5.57436 )
								if( BBupper <= 464.38 )
									ret := -1.000000 // sell
								if( BBupper > 464.38 )
									ret := -0.750000 // sell
				if( dif_source_BBlower > 25.4258 )
					if( BBupper <= 425.395 )
						if( vrsi <= 31.9911 )
							if( dif_source_BBupper <= -8.77506 )
								ret := 1.000000 // buy
							if( dif_source_BBupper > -8.77506 )
								if( BBlower <= 385.75 )
									ret := 0.333333
								if( BBlower > 385.75 )
									ret := -0.875000 // sell
						if( vrsi > 31.9911 )
							if( vrsi <= 34.647 )
								ret := -1.000000 // sell
							if( vrsi > 34.647 )
								if( dif_source_BBlower <= 32.1714 )
									ret := -0.333333
								if( dif_source_BBlower > 32.1714 )
									ret := -1.000000 // sell
					if( BBupper > 425.395 )
						if( BBlower <= 387.046 )
							if( BBlower <= 383.088 )
								ret := -0.750000 // sell
							if( BBlower > 383.088 )
								ret := -1.000000 // sell
						if( BBlower > 387.046 )
							if( dif_source_BBupper <= -12.5917 )
								ret := -0.250000
							if( dif_source_BBupper > -12.5917 )
								if( BBlower <= 387.349 )
									ret := -0.400000
								if( BBlower > 387.349 )
									ret := -1.000000 // sell
		if( dif_source_BBupper > -3.26067 )
			if( BBupper <= 398.692 )
				if( dif_source_BBlower <= 5.7943 )
					if( dif_source_BBupper <= -1.29963 )
						if( BBupper <= 395.652 )
							if( vrsi <= 52.9252 )
								if( vrsi <= 13.544 )
									ret := 0.500000
								if( vrsi > 13.544 )
									ret := 0.906667 // buy
							if( vrsi > 52.9252 )
								if( vrsi <= 61.8901 )
									ret := 0.250000
								if( vrsi > 61.8901 )
									ret := 0.000000
						if( BBupper > 395.652 )
							if( BBupper <= 395.806 )
								if( BBupper <= 395.71 )
									ret := 0.114286
								if( BBupper > 395.71 )
									ret := -0.571429
							if( BBupper > 395.806 )
								if( BBlower <= 395.102 )
									ret := 0.452830
								if( BBlower > 395.102 )
									ret := -0.250000
					if( dif_source_BBupper > -1.29963 )
						if( BBlower <= 388.839 )
							if( vrsi <= 45.9494 )
								ret := 0.250000
							if( vrsi > 45.9494 )
								if( BBlower <= 388.821 )
									ret := -1.000000 // sell
								if( BBlower > 388.821 )
									ret := -0.500000
						if( BBlower > 388.839 )
							if( dif_source_BBlower <= 4.86346 )
								if( dif_source_BBupper <= -0.724947 )
									ret := 0.101523
								if( dif_source_BBupper > -0.724947 )
									ret := 0.327485
							if( dif_source_BBlower > 4.86346 )
								if( BBlower <= 390.599 )
									ret := -0.297297
								if( BBlower > 390.599 )
									ret := 0.666667
				if( dif_source_BBlower > 5.7943 )
					if( BBlower <= 387.554 )
						if( dif_source_BBupper <= -1.55336 )
							if( dif_source_BBlower <= 10.3001 )
								ret := -0.666667
							if( dif_source_BBlower > 10.3001 )
								if( BBupper <= 397.822 )
									ret := 0.772727 // buy
								if( BBupper > 397.822 )
									ret := 0.285714
						if( dif_source_BBupper > -1.55336 )
							if( vrsi <= 99.3612 )
								ret := -1.000000 // sell
							if( vrsi > 99.3612 )
								ret := 0.500000
					if( BBlower > 387.554 )
						if( vrsi <= 99.9869 )
							if( dif_source_BBupper <= 2.21078 )
								if( BBlower <= 390.604 )
									ret := 0.735849 // buy
								if( BBlower > 390.604 )
									ret := 1.000000 // buy
							if( dif_source_BBupper > 2.21078 )
								ret := 0.285714
						if( vrsi > 99.9869 )
							ret := -0.500000
			if( BBupper > 398.692 )
				if( BBlower <= 391.754 )
					if( BBlower <= 390.273 )
						if( BBlower <= 382.453 )
							if( dif_source_BBlower <= 15.0956 )
								ret := 0.200000
							if( dif_source_BBlower > 15.0956 )
								if( vrsi <= 85.0643 )
									ret := -0.888889 // sell
								if( vrsi > 85.0643 )
									ret := 0.000000
						if( BBlower > 382.453 )
							if( vrsi <= 77.5486 )
								if( BBupper <= 419.73 )
									ret := 0.226891
								if( BBupper > 419.73 )
									ret := -0.857143 // sell
							if( vrsi > 77.5486 )
								if( BBupper <= 401.368 )
									ret := 0.000000
								if( BBupper > 401.368 )
									ret := -0.857143 // sell
					if( BBlower > 390.273 )
						if( BBupper <= 399.209 )
							if( BBupper <= 398.965 )
								ret := 0.666667
							if( BBupper > 398.965 )
								ret := 0.000000
						if( BBupper > 399.209 )
							if( vrsi <= 0.318952 )
								ret := 1.000000 // buy
							if( vrsi > 0.318952 )
								if( BBupper <= 400.149 )
									ret := -0.340426
								if( BBupper > 400.149 )
									ret := -0.835821 // sell
				if( BBlower > 391.754 )
					if( BBlower <= 396.743 )
						if( BBupper <= 407.898 )
							if( dif_source_BBlower <= 2.38737 )
								if( vrsi <= 33.1261 )
									ret := -0.641026
								if( vrsi > 33.1261 )
									ret := 0.137405
							if( dif_source_BBlower > 2.38737 )
								if( vrsi <= 0.656917 )
									ret := 0.605263
								if( vrsi > 0.656917 )
									ret := 0.158621
						if( BBupper > 407.898 )
							if( dif_source_BBlower <= 13.3239 )
								if( vrsi <= 67.7382 )
									ret := -0.535714
								if( vrsi > 67.7382 )
									ret := 0.363636
							if( dif_source_BBlower > 13.3239 )
								if( BBupper <= 409.122 )
									ret := -0.500000
								if( BBupper > 409.122 )
									ret := -1.000000 // sell
					if( BBlower > 396.743 )
						if( dif_source_BBlower <= 2.39651 )
							if( vrsi <= 31.2373 )
								if( BBlower <= 417.11 )
									ret := 0.203890
								if( BBlower > 417.11 )
									ret := 0.033703
							if( vrsi > 31.2373 )
								if( BBupper <= 402.785 )
									ret := -0.222910
								if( BBupper > 402.785 )
									ret := 0.019481
						if( dif_source_BBlower > 2.39651 )
							if( dif_source_BBlower <= 9.43525 )
								if( BBupper <= 455.182 )
									ret := -0.009985
								if( BBupper > 455.182 )
									ret := -0.110294
							if( dif_source_BBlower > 9.43525 )
								if( BBupper <= 419.981 )
									ret := -0.010870
								if( BBupper > 419.981 )
									ret := -0.345455
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Bollinger_RSI_Double_Strategy 
//@version=5
//strategy "Bollinger + RSI, Double Strategy (by ChartArt) v1.1", shorttitle="CA_-_RSI_Bol_Strat_1.1", overlay=true)

// ChartArt's RSI + Bollinger Bands, Double Strategy - Update
//
// Version 1.1
// Idea by ChartArt on January 18, 2015.
//
// This strategy uses the RSI indicator
// together with the Bollinger Bands
// to sell when the price is above the
// upper Bollinger Band (and to buy when
// this value is below the lower band).
//
// This simple strategy only triggers when
// both the RSI and the Bollinger Bands
// indicators are at the same time in
// a overbought or oversold condition.
//
// In this version 1.1 the strategy was
// both simplified for the user and
// made more successful in backtesting.
//
// List of my work:
// https://www.tradingview.com/u/ChartArt/
//
//  __             __  ___       __  ___
// /  ` |__|  /\  |__)  |   /\  |__)  |
// \__, |  | /~~\ |  \  |  /~~\ |  \  |
//
//

///////////// RSI
RSIlength = input.int(6, title="RSI Period Length")
RSIoverSold = 50
RSIoverBought = 50
price = close
vrsi = ta.rsi(price, RSIlength)

///////////// Bollinger Bands
BBlength = input.int(200, minval=1, title="Bollinger Period Length")
BBmult = 2 // input(2.0, minval=0.001, maxval=50,title="Bollinger Bands Standard Deviation")
BBbasis = ta.sma(price, BBlength)
BBdev = BBmult * ta.stdev(price, BBlength)
BBupper = BBbasis + BBdev
BBlower = BBbasis - BBdev
source = close
buyEntry = ta.crossover(source, BBlower)
sellEntry = ta.crossunder(source, BBupper)
plot(BBbasis, color=color.aqua, title="Bollinger Bands SMA Basis Line")
p1 = plot(BBupper, color=color.silver, title="Bollinger Bands Upper Line")
p2 = plot(BBlower, color=color.silver, title="Bollinger Bands Lower Line")
fill(p1, p2)

///////////// Colors
switch1 = input(true, title="Enable Bar Color?")
switch2 = input(true, title="Enable Background Color?")
TrendColor = (price[1] > BBupper and price < BBupper and BBbasis < BBbasis[1]) ? color.red : (price[1] < BBlower and price > BBlower and BBbasis > BBbasis[1]) ? color.green : na
// bgColor1 = color.new(TrendColor, 70)
barcolor(switch1 ? TrendColor : na)

// Using color.new() to set transparency
bgColor = color.new(TrendColor, 90)
bgcolor(switch2 ? bgColor : na)

///////////// RSI + Bollinger Bands Strategy
crossover_rsi_bblower = ta.crossover(vrsi, RSIoverSold) and ta.crossover(source, BBlower)
crossunder_rsi_bbupper = ta.crossunder(vrsi, RSIoverBought) and ta.crossunder(source, BBupper)

crossover_rsi_bblowerInt = crossover_rsi_bblower ? 1: 0    //Bool to int
crossunder_rsi_bbupperInt = crossunder_rsi_bbupper ? 1: 0  //Bool to int

dif_vrsi_RSIoverSold = vrsi - RSIoverSold
dif_source_BBlower = source - BBlower
dif_vrsi_RSIoverBought = vrsi - RSIoverBought
dif_source_BBupper = source - BBupper

// if not na(vrsi)
//     if crossover_rsi_bblower
//         strategy.entry("RSI_BB_L", strategy.long, stop=BBlower, oca_type=strategy.oca.cancel, comment="RSI_BB_L")
//     else
//         strategy.cancel(id="RSI_BB_L")
//
//     if crossunder_rsi_bbupper
//         strategy.entry("RSI_BB_S", strategy.short, stop=BBupper, oca_type=strategy.oca.cancel, comment="RSI_BB_S")
//     else
//         strategy.cancel(id="RSI_BB_S")

//plot(strategy.equity, title="equity", color=color.red, linewidth=2, style=plot.style_areabr)
// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_MSFT_1Min_8d62e641(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


