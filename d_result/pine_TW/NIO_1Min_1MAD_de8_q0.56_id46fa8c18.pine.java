//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: NIO_1Min_1MAD_46fa8c18 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NIO_1Min_1MAD_46fa8c18", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NIO_1Min_46fa8c18(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ma30_colorInt <= 1.5 )
		if( ma45 <= 4.46992 )
			if( ma65 <= 3.76764 )
				if( ma50 <= 3.74856 )
					if( ma05_colorInt <= 1.5 )
						if( ma05 <= 3.79674 )
							if( ma20 <= 3.74492 )
								if( ma25 <= 3.74077 )
									ret := -0.091176
								if( ma25 > 3.74077 )
									ret := -0.842105 // sell
							if( ma20 > 3.74492 )
								if( ma90_colorInt <= 2.5 )
									ret := 0.816667 // buy
								if( ma90_colorInt > 2.5 )
									ret := -0.300000
						if( ma05 > 3.79674 )
							if( ma50 <= 3.74411 )
								ret := -0.722222 // sell
							if( ma50 > 3.74411 )
								ret := -1.000000 // sell
					if( ma05_colorInt > 1.5 )
						if( ma45 <= 3.73415 )
							if( ma25 <= 3.71756 )
								ret := 0.117647
							if( ma25 > 3.71756 )
								if( ma50 <= 3.71541 )
									ret := 0.939394 // buy
								if( ma50 > 3.71541 )
									ret := 0.407407
						if( ma45 > 3.73415 )
							if( ma20 <= 3.74745 )
								ret := -0.266667
							if( ma20 > 3.74745 )
								ret := 0.636364
				if( ma50 > 3.74856 )
					if( ma05 <= 3.77883 )
						ret := -0.538462
					if( ma05 > 3.77883 )
						if( ma85 <= 3.74471 )
							if( ma20 <= 3.77959 )
								ret := 0.647059
							if( ma20 > 3.77959 )
								if( ma20 <= 3.78964 )
									ret := 1.000000 // buy
								if( ma20 > 3.78964 )
									ret := 0.615385
						if( ma85 > 3.74471 )
							if( ma85 <= 3.74736 )
								ret := -0.454545
							if( ma85 > 3.74736 )
								if( ma50 <= 3.76734 )
									ret := 0.060606
								if( ma50 > 3.76734 )
									ret := 0.519231
			if( ma65 > 3.76764 )
				if( ma35 <= 4.42361 )
					if( ma10_colorInt <= 1.5 )
						if( ma45 <= 4.27309 )
							if( ma75 <= 4.05938 )
								if( ma25 <= 3.86976 )
									ret := -0.376834
								if( ma25 > 3.86976 )
									ret := -0.136775
							if( ma75 > 4.05938 )
								if( ma75 <= 4.07346 )
									ret := -0.584245
								if( ma75 > 4.07346 )
									ret := -0.290196
						if( ma45 > 4.27309 )
							if( ma100 <= 4.2975 )
								if( ma65 <= 4.28889 )
									ret := 0.090090
								if( ma65 > 4.28889 )
									ret := 0.654971
							if( ma100 > 4.2975 )
								if( ma20 <= 4.43968 )
									ret := -0.098862
								if( ma20 > 4.43968 )
									ret := -0.955556 // sell
					if( ma10_colorInt > 1.5 )
						if( ma20 <= 4.37425 )
							if( ma40 <= 4.07776 )
								if( ma10_colorInt <= 2.5 )
									ret := 0.301407
								if( ma10_colorInt > 2.5 )
									ret := -0.440000
							if( ma40 > 4.07776 )
								if( ma10 <= 4.09218 )
									ret := -0.692308
								if( ma10 > 4.09218 )
									ret := 0.125628
						if( ma20 > 4.37425 )
							if( ma70 <= 4.37225 )
								if( ma35 <= 4.40511 )
									ret := -0.330827
								if( ma35 > 4.40511 )
									ret := -0.941176 // sell
							if( ma70 > 4.37225 )
								if( ma80_colorInt <= 1.5 )
									ret := 0.042857
								if( ma80_colorInt > 1.5 )
									ret := -0.596154
				if( ma35 > 4.42361 )
					if( ma65 <= 4.41839 )
						if( ma05 <= 4.43611 )
							if( ma65 <= 4.4068 )
								ret := 0.666667
							if( ma65 > 4.4068 )
								ret := 0.375000
						if( ma05 > 4.43611 )
							if( ma50 <= 4.4116 )
								if( ma45 <= 4.41059 )
									ret := -0.882353 // sell
								if( ma45 > 4.41059 )
									ret := -1.000000 // sell
							if( ma50 > 4.4116 )
								if( ma20_colorInt <= 1.5 )
									ret := -0.824000 // sell
								if( ma20_colorInt > 1.5 )
									ret := -0.100000
					if( ma65 > 4.41839 )
						if( ma10_colorInt <= 1.5 )
							if( ma25 <= 4.43185 )
								if( ma55 <= 4.42418 )
									ret := 0.562500
								if( ma55 > 4.42418 )
									ret := -0.858696 // sell
							if( ma25 > 4.43185 )
								if( ma75 <= 4.431 )
									ret := 0.071429
								if( ma75 > 4.431 )
									ret := -0.316722
						if( ma10_colorInt > 1.5 )
							if( ma15 <= 4.47326 )
								if( ma85 <= 4.44085 )
									ret := 0.035211
								if( ma85 > 4.44085 )
									ret := -0.444444
							if( ma15 > 4.47326 )
								if( ma80 <= 4.44806 )
									ret := 0.615385
								if( ma80 > 4.44806 )
									ret := -0.217391
		if( ma45 > 4.46992 )
			if( ma10_colorInt <= 1.5 )
				if( ma100 <= 4.4836 )
					if( ma30 <= 4.48655 )
						if( ma15 <= 4.48274 )
							if( ma40 <= 4.47278 )
								if( ma05 <= 4.4756 )
									ret := -0.700000 // sell
								if( ma05 > 4.4756 )
									ret := 0.047619
							if( ma40 > 4.47278 )
								if( ma80 <= 4.46711 )
									ret := 0.850000 // buy
								if( ma80 > 4.46711 )
									ret := 0.234234
						if( ma15 > 4.48274 )
							if( ma05 <= 4.48748 )
								if( ma45 <= 4.47722 )
									ret := -0.333333
								if( ma45 > 4.47722 )
									ret := -0.755556 // sell
							if( ma05 > 4.48748 )
								if( ma50 <= 4.47198 )
									ret := -0.840000 // sell
								if( ma50 > 4.47198 )
									ret := -0.142857
					if( ma30 > 4.48655 )
						if( ma10 <= 4.52514 )
							if( ma45 <= 4.47934 )
								ret := 0.200000
							if( ma45 > 4.47934 )
								if( ma100 <= 4.46657 )
									ret := 0.000000
								if( ma100 > 4.46657 )
									ret := 0.751323 // buy
						if( ma10 > 4.52514 )
							if( ma100 <= 4.47561 )
								ret := 0.727273 // buy
							if( ma100 > 4.47561 )
								ret := -0.360000
				if( ma100 > 4.4836 )
					if( ma35 <= 4.95879 )
						if( ma55 <= 4.84569 )
							if( ma30 <= 4.83665 )
								if( ma85 <= 4.74174 )
									ret := -0.097081
								if( ma85 > 4.74174 )
									ret := -0.236804
							if( ma30 > 4.83665 )
								if( ma90 <= 4.8046 )
									ret := 0.942308 // buy
								if( ma90 > 4.8046 )
									ret := 0.000000
						if( ma55 > 4.84569 )
							if( ma70 <= 4.93255 )
								if( ma85_colorInt <= 2.5 )
									ret := -0.291803
								if( ma85_colorInt > 2.5 )
									ret := -0.417625
							if( ma70 > 4.93255 )
								if( ma75 <= 4.93251 )
									ret := -0.937500 // sell
								if( ma75 > 4.93251 )
									ret := -0.489796
					if( ma35 > 4.95879 )
						if( ma60 <= 5.26915 )
							if( ma55 <= 4.9589 )
								if( ma100 <= 4.91554 )
									ret := -0.666667
								if( ma100 > 4.91554 )
									ret := 0.816514 // buy
							if( ma55 > 4.9589 )
								if( ma05 <= 5.27278 )
									ret := -0.050411
								if( ma05 > 5.27278 )
									ret := 0.309593
						if( ma60 > 5.26915 )
							if( ma30 <= 5.28685 )
								if( ma80_colorInt <= 2.5 )
									ret := -0.357955
								if( ma80_colorInt > 2.5 )
									ret := -0.619048
							if( ma30 > 5.28685 )
								if( ma20 <= 5.36575 )
									ret := -0.211649
								if( ma20 > 5.36575 )
									ret := -0.088125
			if( ma10_colorInt > 1.5 )
				if( ma50 <= 5.28309 )
					if( ma70 <= 5.07582 )
						if( ma20 <= 4.99693 )
							if( ma50 <= 4.72188 )
								if( ma90 <= 4.66141 )
									ret := 0.137177
								if( ma90 > 4.66141 )
									ret := -0.402439
							if( ma50 > 4.72188 )
								if( ma25 <= 4.80831 )
									ret := 0.643564
								if( ma25 > 4.80831 )
									ret := 0.079787
						if( ma20 > 4.99693 )
							if( ma70 <= 4.97054 )
								if( ma40 <= 4.96487 )
									ret := -0.833333 // sell
								if( ma40 > 4.96487 )
									ret := -1.000000 // sell
							if( ma70 > 4.97054 )
								if( ma90_colorInt <= 1.5 )
									ret := 0.046512
								if( ma90_colorInt > 1.5 )
									ret := -0.571429
					if( ma70 > 5.07582 )
						if( ma85 <= 5.1019 )
							if( ma85 <= 5.08456 )
								ret := 1.000000 // buy
							if( ma85 > 5.08456 )
								if( ma45 <= 5.14618 )
									ret := 0.833333 // buy
								if( ma45 > 5.14618 )
									ret := 0.937500 // buy
						if( ma85 > 5.1019 )
							if( ma15 <= 5.28679 )
								if( ma15 <= 5.23532 )
									ret := 0.472637
								if( ma15 > 5.23532 )
									ret := 0.125392
							if( ma15 > 5.28679 )
								if( ma85 <= 5.25738 )
									ret := 0.924528 // buy
								if( ma85 > 5.25738 )
									ret := 0.310345
				if( ma50 > 5.28309 )
					if( ma100 <= 5.28935 )
						if( ma10 <= 5.29049 )
							ret := -1.000000 // sell
						if( ma10 > 5.29049 )
							if( ma65 <= 5.28301 )
								if( ma20 <= 5.31314 )
									ret := 0.066667
								if( ma20 > 5.31314 )
									ret := 0.600000
							if( ma65 > 5.28301 )
								if( ma60 <= 5.30988 )
									ret := -0.537879
								if( ma60 > 5.30988 )
									ret := 0.375000
					if( ma100 > 5.28935 )
						if( ma15 <= 6.78197 )
							if( ma85 <= 5.33755 )
								if( ma25 <= 5.43651 )
									ret := 0.156863
								if( ma25 > 5.43651 )
									ret := 1.000000 // buy
							if( ma85 > 5.33755 )
								if( ma40 <= 5.68956 )
									ret := -0.105677
								if( ma40 > 5.68956 )
									ret := 0.084025
						if( ma15 > 6.78197 )
							if( ma45 <= 6.83909 )
								if( ma20 <= 6.81632 )
									ret := -0.250000
								if( ma20 > 6.81632 )
									ret := -0.758065 // sell
							if( ma45 > 6.83909 )
								if( ma50 <= 7.43885 )
									ret := -0.127119
								if( ma50 > 7.43885 )
									ret := -0.757576 // sell
	if( ma30_colorInt > 1.5 )
		if( ma70_colorInt <= 3.5 )
			if( ma15_colorInt <= 3.5 )
				if( ma50 <= 4.42548 )
					if( ma85 <= 3.70778 )
						if( ma40 <= 3.68996 )
							if( ma90 <= 3.68664 )
								if( ma50 <= 3.68397 )
									ret := 0.884615 // buy
								if( ma50 > 3.68397 )
									ret := 0.181818
							if( ma90 > 3.68664 )
								if( ma75 <= 3.68685 )
									ret := 0.863636 // buy
								if( ma75 > 3.68685 )
									ret := 0.972973 // buy
						if( ma40 > 3.68996 )
							if( ma15 <= 3.69858 )
								if( ma30 <= 3.6962 )
									ret := 0.105263
								if( ma30 > 3.6962 )
									ret := -0.960000 // sell
							if( ma15 > 3.69858 )
								if( ma05 <= 3.70623 )
									ret := 0.861635 // buy
								if( ma05 > 3.70623 )
									ret := 0.294118
					if( ma85 > 3.70778 )
						if( ma05_colorInt <= 3.5 )
							if( ma85_colorInt <= 1.5 )
								if( ma30 <= 4.39102 )
									ret := 0.194481
								if( ma30 > 4.39102 )
									ret := -0.071845
							if( ma85_colorInt > 1.5 )
								if( ma75 <= 4.43163 )
									ret := 0.265718
								if( ma75 > 4.43163 )
									ret := -0.783784 // sell
						if( ma05_colorInt > 3.5 )
							if( ma35 <= 4.01327 )
								if( ma15 <= 3.93766 )
									ret := -0.200000
								if( ma15 > 3.93766 )
									ret := -0.557143
							if( ma35 > 4.01327 )
								if( ma70 <= 4.41646 )
									ret := -0.066074
								if( ma70 > 4.41646 )
									ret := 0.605634
				if( ma50 > 4.42548 )
					if( ma75 <= 7.23605 )
						if( ma15_colorInt <= 1.5 )
							if( ma100 <= 4.65118 )
								if( ma35_colorInt <= 1.5 )
									ret := 0.857143 // buy
								if( ma35_colorInt > 1.5 )
									ret := -0.542636
							if( ma100 > 4.65118 )
								if( ma100 <= 4.71071 )
									ret := 0.380282
								if( ma100 > 4.71071 )
									ret := -0.165289
						if( ma15_colorInt > 1.5 )
							if( ma05_colorInt <= 3.5 )
								if( ma40 <= 7.01405 )
									ret := 0.118397
								if( ma40 > 7.01405 )
									ret := 0.394737
							if( ma05_colorInt > 3.5 )
								if( ma50 <= 6.96974 )
									ret := -0.088678
								if( ma50 > 6.96974 )
									ret := 0.615385
					if( ma75 > 7.23605 )
						if( ma45 <= 7.30813 )
							if( ma85 <= 7.2551 )
								ret := -0.357143
							if( ma85 > 7.2551 )
								if( ma30 <= 7.2805 )
									ret := -0.984848 // sell
								if( ma30 > 7.2805 )
									ret := -0.750000 // sell
						if( ma45 > 7.30813 )
							if( ma85 <= 7.37643 )
								if( ma15 <= 7.38649 )
									ret := 0.614458
								if( ma15 > 7.38649 )
									ret := -0.285714
							if( ma85 > 7.37643 )
								if( ma05_colorInt <= 1.5 )
									ret := 0.923077 // buy
								if( ma05_colorInt > 1.5 )
									ret := -0.119843
			if( ma15_colorInt > 3.5 )
				if( ma30_colorInt <= 2.5 )
					if( ma85 <= 5.66845 )
						if( ma25 <= 4.455 )
							if( ma25 <= 4.23608 )
								if( ma25_colorInt <= 2.5 )
									ret := -0.647727
								if( ma25_colorInt > 2.5 )
									ret := 0.333333
							if( ma25 > 4.23608 )
								if( ma20 <= 4.38796 )
									ret := -0.200000
								if( ma20 > 4.38796 )
									ret := 0.111111
						if( ma25 > 4.455 )
							if( ma90 <= 4.89941 )
								if( ma100 <= 4.70607 )
									ret := -0.756098 // sell
								if( ma100 > 4.70607 )
									ret := -1.000000 // sell
							if( ma90 > 4.89941 )
								if( ma80 <= 5.3174 )
									ret := -0.117647
								if( ma80 > 5.3174 )
									ret := -0.712121 // sell
					if( ma85 > 5.66845 )
						if( ma65 <= 6.43993 )
							ret := 0.000000
						if( ma65 > 6.43993 )
							if( ma85 <= 6.9846 )
								ret := -0.500000
							if( ma85 > 6.9846 )
								ret := -0.100000
				if( ma30_colorInt > 2.5 )
					if( ma10_colorInt <= 3.5 )
						if( ma75_colorInt <= 1.5 )
							if( ma40 <= 5.91153 )
								if( ma65 <= 4.8307 )
									ret := 0.010000
								if( ma65 > 4.8307 )
									ret := -0.571429
							if( ma40 > 5.91153 )
								ret := 0.722222 // buy
						if( ma75_colorInt > 1.5 )
							if( ma15 <= 4.44162 )
								if( ma45_colorInt <= 3.5 )
									ret := 0.244275
								if( ma45_colorInt > 3.5 )
									ret := 0.707865 // buy
							if( ma15 > 4.44162 )
								if( ma30 <= 4.51844 )
									ret := -0.555556
								if( ma30 > 4.51844 )
									ret := 0.257384
					if( ma10_colorInt > 3.5 )
						if( ma15 <= 4.06693 )
							if( ma70 <= 3.86775 )
								if( ma55 <= 3.69811 )
									ret := 0.505051
								if( ma55 > 3.69811 )
									ret := -0.067687
							if( ma70 > 3.86775 )
								if( ma25 <= 3.92681 )
									ret := -0.542781
								if( ma25 > 3.92681 )
									ret := -0.320041
						if( ma15 > 4.06693 )
							if( ma85 <= 7.50422 )
								if( ma05 <= 5.40521 )
									ret := -0.079369
								if( ma05 > 5.40521 )
									ret := 0.006809
							if( ma85 > 7.50422 )
								ret := -1.000000 // sell
		if( ma70_colorInt > 3.5 )
			if( ma50 <= 5.70545 )
				if( ma50_colorInt <= 3.5 )
					if( ma25 <= 3.81301 )
						ret := 1.000000 // buy
					if( ma25 > 3.81301 )
						if( ma30_colorInt <= 2.5 )
							if( ma85 <= 4.65473 )
								if( ma05_colorInt <= 1.5 )
									ret := 0.714286 // buy
								if( ma05_colorInt > 1.5 )
									ret := 0.120000
							if( ma85 > 4.65473 )
								if( ma90 <= 4.76145 )
									ret := -0.800000 // sell
								if( ma90 > 4.76145 )
									ret := 0.140000
						if( ma30_colorInt > 2.5 )
							ret := 0.600000
				if( ma50_colorInt > 3.5 )
					if( ma75 <= 5.47103 )
						if( ma65 <= 5.31971 )
							if( ma05 <= 5.28317 )
								if( ma90 <= 5.03409 )
									ret := -0.187265
								if( ma90 > 5.03409 )
									ret := -0.032345
							if( ma05 > 5.28317 )
								if( ma20 <= 5.28383 )
									ret := -0.710059 // sell
								if( ma20 > 5.28383 )
									ret := -0.389646
						if( ma65 > 5.31971 )
							if( ma35 <= 5.34621 )
								if( ma60 <= 5.33177 )
									ret := 0.132231
								if( ma60 > 5.33177 )
									ret := 0.714286 // buy
							if( ma35 > 5.34621 )
								if( ma05 <= 5.42791 )
									ret := -0.247761
								if( ma05 > 5.42791 )
									ret := 0.081886
					if( ma75 > 5.47103 )
						if( ma35 <= 5.47254 )
							if( ma10 <= 5.47637 )
								ret := -0.764706 // sell
							if( ma10 > 5.47637 )
								ret := -1.000000 // sell
						if( ma35 > 5.47254 )
							if( ma65 <= 5.63431 )
								if( ma75 <= 5.49958 )
									ret := -0.032609
								if( ma75 > 5.49958 )
									ret := -0.501458
							if( ma65 > 5.63431 )
								if( ma65 <= 5.65458 )
									ret := 0.529412
								if( ma65 > 5.65458 )
									ret := -0.242268
			if( ma50 > 5.70545 )
				if( ma60 <= 6.07227 )
					if( ma80_colorInt <= 3.5 )
						if( ma05 <= 6.04911 )
							if( ma45 <= 5.94203 )
								ret := 0.529412
							if( ma45 > 5.94203 )
								ret := -0.916667 // sell
						if( ma05 > 6.04911 )
							if( ma65 <= 6.07331 )
								if( ma05_colorInt <= 3.5 )
									ret := 0.500000
								if( ma05_colorInt > 3.5 )
									ret := 1.000000 // buy
							if( ma65 > 6.07331 )
								ret := 0.363636
					if( ma80_colorInt > 3.5 )
						if( ma25 <= 5.89936 )
							if( ma40 <= 5.87822 )
								if( ma80 <= 5.84475 )
									ret := 0.177778
								if( ma80 > 5.84475 )
									ret := 0.500000
							if( ma40 > 5.87822 )
								if( ma65 <= 5.90978 )
									ret := -1.000000 // sell
								if( ma65 > 5.90978 )
									ret := -0.500000
						if( ma25 > 5.89936 )
							if( ma85 <= 6.0804 )
								if( ma10 <= 6.00864 )
									ret := 0.543478
								if( ma10 > 6.00864 )
									ret := 0.854545 // buy
							if( ma85 > 6.0804 )
								if( ma100 <= 6.09678 )
									ret := 0.461538
								if( ma100 > 6.09678 )
									ret := -0.363636
				if( ma60 > 6.07227 )
					if( ma50 <= 6.08984 )
						if( ma15_colorInt <= 2.5 )
							if( ma05 <= 6.09907 )
								if( ma20_colorInt <= 3 )
									ret := 0.125000
								if( ma20_colorInt > 3 )
									ret := 0.529412
							if( ma05 > 6.09907 )
								ret := -0.647059
						if( ma15_colorInt > 2.5 )
							if( ma70 <= 6.07852 )
								if( ma25 <= 6.06988 )
									ret := -1.000000 // sell
								if( ma25 > 6.06988 )
									ret := -0.815789 // sell
							if( ma70 > 6.07852 )
								if( ma35 <= 6.08204 )
									ret := 0.088235
								if( ma35 > 6.08204 )
									ret := -0.719298 // sell
					if( ma50 > 6.08984 )
						if( ma35 <= 6.76454 )
							if( ma20_colorInt <= 1.5 )
								if( ma55 <= 6.67092 )
									ret := -0.750000 // sell
								if( ma55 > 6.67092 )
									ret := 0.517241
							if( ma20_colorInt > 1.5 )
								if( ma100 <= 6.23539 )
									ret := 0.550898
								if( ma100 > 6.23539 )
									ret := 0.068750
						if( ma35 > 6.76454 )
							if( ma15 <= 6.78161 )
								if( ma50 <= 6.76961 )
									ret := -0.531250
								if( ma50 > 6.76961 )
									ret := -0.968750 // sell
							if( ma15 > 6.78161 )
								if( ma80 <= 6.82503 )
									ret := 0.309091
								if( ma80 > 6.82503 )
									ret := -0.230563
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Madrid_Moving_Average_Ribbon 
//@version=5
//indicator "Madrid Moving Average Ribbon", shorttitle="Madrid Ribbon", overlay=true)


PHI     = (1 + math.sqrt(5)) / 2
PI      = 104348 / 33215

BULL    = 1
BEAR    = -1
NONE    = 0

GRN01 = color.rgb(124, 252, 0)
GRN02 = color.rgb(50, 205, 50)
GRN03 = color.rgb(34, 139, 34)
GRN04 = color.rgb(0, 100, 0)
GRN05 = color.rgb(0, 128, 0)
GRN06 = color.rgb(9, 53, 7)
RED01 = color.rgb(255, 69, 0)
RED02 = color.rgb(255, 0, 0)
RED03 = color.rgb(178, 34, 34)
RED04 = color.rgb(139, 0, 0)
RED05 = color.rgb(128, 0, 0)
RED06 = color.rgb(51, 13, 6)

// Define other v3 Style Colors
AQUA    = color.rgb(0, 255, 255)
BLACK   = color.rgb(0, 0, 0)
BLUE    = color.rgb(0, 0, 255)
FUCHSIA = color.rgb(255, 0, 255)
GRAY    = color.rgb(128, 128, 128)
GREEN   = color.rgb(0, 128, 0)
LIME    = color.rgb(0, 255, 0)
MAROON  = color.rgb(128, 0, 0)
NAVY    = color.rgb(0, 0, 128)
OLIVE   = color.rgb(128, 128, 0)
ORANGE  = color.rgb(255, 127, 0)
PURPLE  = color.rgb(128, 0, 128)
RUBI    = color.rgb(255, 0, 0)
SILVER  = color.rgb(192, 192, 192)
TEAL    = color.rgb(0, 128, 128)
YELLOW  = color.rgb(255, 255, 0)
WHITE   = color.rgb(255, 255, 255)


// ──────────[ Moving Average Color ]
maColor(_ma, _maRef) =>
    diffMA = ta.change(_ma)
    diffMA >= 0 and _ma > _maRef ? LIME : diffMA < 0 and _ma > _maRef ? MAROON : diffMA <= 0 and _ma < _maRef ? RUBI : diffMA >= 0 and _ma < _maRef ? GREEN : GRAY

// Function to calculate the integer representing the color condition
ma_color_int(ma, ma_ref) =>
    diff_ma = ta.change(ma)
    diff_ma >= 0 and ma > ma_ref ? 1 : diff_ma < 0 and ma > ma_ref ? 2 : diff_ma <= 0 and ma < ma_ref ? 3 : diff_ma >= 0 and ma < ma_ref ? 4 : 5


_10   = input.bool(false, '───────────[ Madrid Ribbon]───────────' )
i_exp = input(true, title="Exponential MA")

// ────────────────────[ Processing ]
src = close

ma05  = i_exp ? ta.ema(src, 5) : ta.sma(src, 5)
ma10  = i_exp ? ta.ema(src, 10) : ta.sma(src, 10)
ma15  = i_exp ? ta.ema(src, 15) : ta.sma(src, 15)
ma20  = i_exp ? ta.ema(src, 20) : ta.sma(src, 20)
ma25  = i_exp ? ta.ema(src, 25) : ta.sma(src, 25)
ma30  = i_exp ? ta.ema(src, 30) : ta.sma(src, 30)
ma35  = i_exp ? ta.ema(src, 35) : ta.sma(src, 35)
ma40  = i_exp ? ta.ema(src, 40) : ta.sma(src, 40)
ma45  = i_exp ? ta.ema(src, 45) : ta.sma(src, 45)
ma50  = i_exp ? ta.ema(src, 50) : ta.sma(src, 50)
ma55  = i_exp ? ta.ema(src, 55) : ta.sma(src, 55)
ma60  = i_exp ? ta.ema(src, 60) : ta.sma(src, 60)
ma65  = i_exp ? ta.ema(src, 65) : ta.sma(src, 65)
ma70  = i_exp ? ta.ema(src, 70) : ta.sma(src, 70)
ma75  = i_exp ? ta.ema(src, 75) : ta.sma(src, 75)
ma80  = i_exp ? ta.ema(src, 80) : ta.sma(src, 80)
ma85  = i_exp ? ta.ema(src, 85) : ta.sma(src, 85)
ma90  = i_exp ? ta.ema(src, 90) : ta.sma(src, 90)
ma100 = i_exp ? ta.ema(src, 100) : ta.sma(src, 100)

// ────────────────────[ Plot ]
plot(ma05, color=maColor(ma05, ma100), title="MMA05", linewidth=3)
plot(ma10, color=maColor(ma10, ma100), title="MMA10", linewidth=1)
plot(ma15, color=maColor(ma15, ma100), title="MMA15", linewidth=1)
plot(ma20, color=maColor(ma20, ma100), title="MMA20", linewidth=1)
plot(ma25, color=maColor(ma25, ma100), title="MMA25", linewidth=1)
plot(ma30, color=maColor(ma30, ma100), title="MMA30", linewidth=1)
plot(ma35, color=maColor(ma35, ma100), title="MMA35", linewidth=1)
plot(ma40, color=maColor(ma40, ma100), title="MMA40", linewidth=1)
plot(ma45, color=maColor(ma45, ma100), title="MMA45", linewidth=1)
plot(ma50, color=maColor(ma50, ma100), title="MMA50", linewidth=1)
plot(ma55, color=maColor(ma55, ma100), title="MMA55", linewidth=1)
plot(ma60, color=maColor(ma60, ma100), title="MMA60", linewidth=1)
plot(ma65, color=maColor(ma65, ma100), title="MMA65", linewidth=1)
plot(ma70, color=maColor(ma70, ma100), title="MMA70", linewidth=1)
plot(ma75, color=maColor(ma75, ma100), title="MMA75", linewidth=1)
plot(ma80, color=maColor(ma80, ma100), title="MMA80", linewidth=1)
plot(ma85, color=maColor(ma85, ma100), title="MMA85", linewidth=1)
plot(ma90, color=maColor(ma90, ma100), title="MMA90", linewidth=3)



//Calculate colors based on the moving averages compared to ma100
ma05_colorInt = ma_color_int(ma05, ma100)
ma10_colorInt = ma_color_int(ma10, ma100)
ma15_colorInt = ma_color_int(ma15, ma100)
ma20_colorInt = ma_color_int(ma20, ma100)
ma25_colorInt = ma_color_int(ma25, ma100)
ma30_colorInt = ma_color_int(ma30, ma100)
ma35_colorInt = ma_color_int(ma35, ma100)
ma40_colorInt = ma_color_int(ma40, ma100)
ma45_colorInt = ma_color_int(ma45, ma100)
ma50_colorInt = ma_color_int(ma50, ma100)
ma55_colorInt = ma_color_int(ma55, ma100)
ma60_colorInt = ma_color_int(ma60, ma100)
ma65_colorInt = ma_color_int(ma65, ma100)
ma70_colorInt = ma_color_int(ma70, ma100)
ma75_colorInt = ma_color_int(ma75, ma100)
ma80_colorInt = ma_color_int(ma80, ma100)
ma85_colorInt = ma_color_int(ma85, ma100)
ma90_colorInt = ma_color_int(ma90, ma100)


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
float op_operation = decision_tree_0_NIO_1Min_46fa8c18(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)

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


