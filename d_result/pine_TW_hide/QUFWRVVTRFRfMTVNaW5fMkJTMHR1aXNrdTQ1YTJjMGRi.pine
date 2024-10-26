//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: AAVEUSDT_15Min_2BS0_45a2c0db Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_15Min_2BS0_45a2c0db", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_15Min_45a2c0db(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( smoothK_k <= 47.4321 )
		if( k <= 14.8173 )
			if( bullPower <= 0.35142 )
				if( rsi1 <= 34.8822 )
					if( bbp <= -0.891864 )
						if( d_k <= 2.83974 )
							if( rsi1 <= 23.8382 )
								if( bearPower <= -1.39244 )
									ret := -0.303424
								if( bearPower > -1.39244 )
									ret := -0.625099
							if( rsi1 > 23.8382 )
								if( bbp <= -5.38844 )
									ret := 0.384615
								if( bbp > -5.38844 )
									ret := -0.260627
						if( d_k > 2.83974 )
							if( smoothK_k <= -1.11879 )
								if( bullPower <= -0.183679 )
									ret := 0.130699
								if( bullPower > -0.183679 )
									ret := -0.483871
							if( smoothK_k > -1.11879 )
								if( bbp <= -5.67943 )
									ret := 0.491228
								if( bbp > -5.67943 )
									ret := -0.195271
					if( bbp > -0.891864 )
						if( rsi1 <= 22.2222 )
							if( bbm <= 0.300952 )
								if( bullPower <= -0.079698 )
									ret := -0.410959
								if( bullPower > -0.079698 )
									ret := -0.774590 // sell
							if( bbm > 0.300952 )
								if( bbp <= -0.65809 )
									ret := -0.784127 // sell
								if( bbp > -0.65809 )
									ret := -0.948470 // sell
						if( rsi1 > 22.2222 )
							if( bbm <= 0.301165 )
								if( smoothK_k <= -2.99596 )
									ret := -0.272997
								if( smoothK_k > -2.99596 )
									ret := -0.397959
							if( bbm > 0.301165 )
								if( rsi1 <= 33.2954 )
									ret := -0.660870
								if( rsi1 > 33.2954 )
									ret := -0.475891
				if( rsi1 > 34.8822 )
					if( bullPower <= -0.10981 )
						if( d_k <= -3.68837 )
							if( d <= 7.77645 )
								if( smoothD_d <= 2.50624 )
									ret := -0.450704
								if( smoothD_d > 2.50624 )
									ret := 0.236111
							if( d > 7.77645 )
								if( d <= 8.38707 )
									ret := -0.647059
								if( d > 8.38707 )
									ret := -1.000000 // sell
						if( d_k > -3.68837 )
							if( bearPower <= -0.766352 )
								if( smoothK_k <= -2.84934 )
									ret := -0.124138
								if( smoothK_k > -2.84934 )
									ret := 0.294057
							if( bearPower > -0.766352 )
								if( smoothK_k <= -0.715993 )
									ret := 0.391667
								if( smoothK_k > -0.715993 )
									ret := -0.054585
					if( bullPower > -0.10981 )
						if( bearPower <= -0.241207 )
							if( rsi1 <= 42.5603 )
								if( d_k <= -0.432787 )
									ret := -0.423313
								if( d_k > -0.432787 )
									ret := -0.070448
							if( rsi1 > 42.5603 )
								if( smoothK_k <= 7.78098 )
									ret := 0.191534
								if( smoothK_k > 7.78098 )
									ret := -0.133803
						if( bearPower > -0.241207 )
							if( d_k <= 7.13283 )
								if( bbp <= 0.190749 )
									ret := -0.098736
								if( bbp > 0.190749 )
									ret := -0.199170
							if( d_k > 7.13283 )
								if( bullPower <= 0.148806 )
									ret := -0.034722
								if( bullPower > 0.148806 )
									ret := -0.324633
			if( bullPower > 0.35142 )
				if( rsi1 <= 49.2691 )
					if( smoothK_k <= 3.8497 )
						if( bullPower <= 0.661691 )
							if( rsi1 <= 39.9835 )
								if( bbp <= -0.029714 )
									ret := -0.760417 // sell
								if( bbp > -0.029714 )
									ret := -0.872032 // sell
							if( rsi1 > 39.9835 )
								if( bbp <= 0.635539 )
									ret := -0.335616
								if( bbp > 0.635539 )
									ret := -0.768000 // sell
						if( bullPower > 0.661691 )
							if( smoothD_d <= 2.30091 )
								if( bbm <= 1.72626 )
									ret := -0.942249 // sell
								if( bbm > 1.72626 )
									ret := -0.822917 // sell
							if( smoothD_d > 2.30091 )
								if( bbp <= 0.30573 )
									ret := 0.000000
								if( bbp > 0.30573 )
									ret := -0.848993 // sell
					if( smoothK_k > 3.8497 )
						if( bullPower <= 0.49309 )
							if( bbp <= -0.275815 )
								if( rsi1 <= 38.1668 )
									ret := -0.422222
								if( rsi1 > 38.1668 )
									ret := 0.354167
							if( bbp > -0.275815 )
								if( rsi1 <= 45.11 )
									ret := -0.660194
								if( rsi1 > 45.11 )
									ret := -0.346535
						if( bullPower > 0.49309 )
							if( d <= 32.8544 )
								if( bbm <= 1.84538 )
									ret := -0.731343 // sell
								if( bbm > 1.84538 )
									ret := -0.276596
							if( d > 32.8544 )
								if( smoothK_k <= 10.2721 )
									ret := -0.925926 // sell
								if( smoothK_k > 10.2721 )
									ret := -0.500000
				if( rsi1 > 49.2691 )
					if( bbp <= 0.858162 )
						if( rsi1 <= 63.7106 )
							if( k <= 14.1705 )
								if( d_k <= -5.92154 )
									ret := -0.605263
								if( d_k > -5.92154 )
									ret := -0.037906
							if( k > 14.1705 )
								if( bbp <= 0.216457 )
									ret := -0.925926 // sell
								if( bbp > 0.216457 )
									ret := -0.341463
						if( rsi1 > 63.7106 )
							if( smoothK_k <= 7.15781 )
								if( bearPower <= 0.074147 )
									ret := 0.578947
								if( bearPower > 0.074147 )
									ret := 0.192308
							if( smoothK_k > 7.15781 )
								if( bbm <= 0.36099 )
									ret := 0.416667
								if( bbm > 0.36099 )
									ret := -0.363636
					if( bbp > 0.858162 )
						if( bullPower <= 1.77893 )
							if( rsi1 <= 55.019 )
								if( bearPower <= -0.271382 )
									ret := 0.000000
								if( bearPower > -0.271382 )
									ret := -0.696759
							if( rsi1 > 55.019 )
								if( d_k <= -3.47229 )
									ret := 0.346154
								if( d_k > -3.47229 )
									ret := -0.220896
						if( bullPower > 1.77893 )
							if( smoothD_d <= 4.30899 )
								if( bullPower <= 3.69475 )
									ret := -0.484127
								if( bullPower > 3.69475 )
									ret := 0.277778
							if( smoothD_d > 4.30899 )
								if( bbp <= 2.43552 )
									ret := -0.434783
								if( bbp > 2.43552 )
									ret := -0.822951 // sell
		if( k > 14.8173 )
			if( bullPower <= 0.484988 )
				if( rsi1 <= 37.7009 )
					if( bullPower <= -0.597054 )
						if( smoothD_d <= 7.80978 )
							if( k <= 16.3211 )
								if( smoothD_d <= 5.23296 )
									ret := -0.444444
								if( smoothD_d > 5.23296 )
									ret := 0.409091
							if( k > 16.3211 )
								if( bbp <= -2.10599 )
									ret := -0.788462 // sell
								if( bbp > -2.10599 )
									ret := -0.227273
						if( smoothD_d > 7.80978 )
							if( bbp <= -7.19529 )
								if( d_k <= -6.36739 )
									ret := -0.875000 // sell
								if( d_k > -6.36739 )
									ret := 0.826667 // buy
							if( bbp > -7.19529 )
								if( smoothD_d <= 61.1039 )
									ret := 0.099734
								if( smoothD_d > 61.1039 )
									ret := -0.666667
					if( bullPower > -0.597054 )
						if( bbp <= -0.034929 )
							if( rsi1 <= 31.4798 )
								if( smoothK_k <= 12.7046 )
									ret := 0.136905
								if( smoothK_k > 12.7046 )
									ret := -0.416938
							if( rsi1 > 31.4798 )
								if( bbm <= 1.20527 )
									ret := -0.214397
								if( bbm > 1.20527 )
									ret := 0.117978
						if( bbp > -0.034929 )
							if( rsi1 <= 31.5516 )
								if( bbm <= 0.207199 )
									ret := -0.384615
								if( bbm > 0.207199 )
									ret := -0.943925 // sell
							if( rsi1 > 31.5516 )
								if( BBPower_Color <= 0.5 )
									ret := -0.737705 // sell
								if( BBPower_Color > 0.5 )
									ret := -0.475000
				if( rsi1 > 37.7009 )
					if( bbp <= -1.05743 )
						if( smoothD_d <= 41.3065 )
							if( d_k <= -10.7366 )
								if( d <= 22.0224 )
									ret := -0.122995
								if( d > 22.0224 )
									ret := 0.474747
							if( d_k > -10.7366 )
								if( bearPower <= -1.13514 )
									ret := 0.559284
								if( bearPower > -1.13514 )
									ret := 0.344064
						if( smoothD_d > 41.3065 )
							if( smoothK_k <= 32.346 )
								if( k <= 25.2906 )
									ret := -0.052632
								if( k > 25.2906 )
									ret := -0.592105
							if( smoothK_k > 32.346 )
								if( smoothK_k <= 34.5578 )
									ret := 0.909091 // buy
								if( smoothK_k > 34.5578 )
									ret := 0.131148
					if( bbp > -1.05743 )
						if( d <= 13.0244 )
							if( bullPower <= 0.168465 )
								if( d <= 7.1203 )
									ret := -0.371429
								if( d > 7.1203 )
									ret := -0.030635
							if( bullPower > 0.168465 )
								if( smoothK_k <= 19.9756 )
									ret := -0.316327
								if( smoothK_k > 19.9756 )
									ret := -0.626374
						if( d > 13.0244 )
							if( rsi1 <= 50.9551 )
								if( bullPower <= 0.25164 )
									ret := 0.006332
								if( bullPower > 0.25164 )
									ret := -0.274445
							if( rsi1 > 50.9551 )
								if( bbm <= 0.400474 )
									ret := 0.125411
								if( bbm > 0.400474 )
									ret := 0.295048
			if( bullPower > 0.484988 )
				if( bearPower <= 0.650431 )
					if( k <= 23.2866 )
						if( smoothD_d <= 12.5758 )
							if( rsi1 <= 49.2111 )
								if( smoothD_d <= 7.51724 )
									ret := -0.904762 // sell
								if( smoothD_d > 7.51724 )
									ret := -0.446809
							if( rsi1 > 49.2111 )
								if( bbm <= 0.746403 )
									ret := -0.337278
								if( bbm > 0.746403 )
									ret := 0.416667
						if( smoothD_d > 12.5758 )
							if( bbp <= -0.087634 )
								if( bbm <= 1.48228 )
									ret := -0.235294
								if( bbm > 1.48228 )
									ret := 0.612903
							if( bbp > -0.087634 )
								if( smoothK_k <= 16.9353 )
									ret := -0.361481
								if( smoothK_k > 16.9353 )
									ret := -0.589347
					if( k > 23.2866 )
						if( bbp <= 0.852356 )
							if( smoothD_d <= 67.1397 )
								if( smoothK_k <= 44.8631 )
									ret := -0.148921
								if( smoothK_k > 44.8631 )
									ret := 0.075397
							if( smoothD_d > 67.1397 )
								if( smoothK_k <= 45.3883 )
									ret := -0.500000
								if( smoothK_k > 45.3883 )
									ret := -0.913043 // sell
						if( bbp > 0.852356 )
							if( d <= 43.2997 )
								if( d_k <= -11.2053 )
									ret := -0.416040
								if( d_k > -11.2053 )
									ret := -0.091542
							if( d > 43.2997 )
								if( smoothD_d <= 45.2806 )
									ret := -0.566308
								if( smoothD_d > 45.2806 )
									ret := -0.299487
				if( bearPower > 0.650431 )
					if( d <= 13.7633 )
						if( rsi1 <= 62.5333 )
							ret := -0.666667
						if( rsi1 > 62.5333 )
							if( bbm <= 1.0817 )
								ret := 0.888889 // buy
							if( bbm > 1.0817 )
								ret := 0.222222
					if( d > 13.7633 )
						if( bbm <= 0.979693 )
							if( smoothK_k <= 40.8311 )
								if( smoothD_d <= 56.894 )
									ret := -0.791155 // sell
								if( smoothD_d > 56.894 )
									ret := 0.111111
							if( smoothK_k > 40.8311 )
								if( bullPower <= 1.67914 )
									ret := 0.034483
								if( bullPower > 1.67914 )
									ret := -0.585366
						if( bbm > 0.979693 )
							if( d <= 63.9934 )
								if( rsi1 <= 71.0523 )
									ret := -0.626566
								if( rsi1 > 71.0523 )
									ret := 0.308271
							if( d > 63.9934 )
								ret := 0.470588
	if( smoothK_k > 47.4321 )
		if( smoothK_k <= 89.4517 )
			if( rsi1 <= 57.8992 )
				if( rsi1 <= 44.1446 )
					if( bearPower <= -0.645826 )
						if( bullPower <= -0.0629 )
							if( rsi1 <= 36.873 )
								if( rsi1 <= 24.8051 )
									ret := -0.363636
								if( rsi1 > 24.8051 )
									ret := 0.088986
							if( rsi1 > 36.873 )
								if( smoothK_k <= 80.8394 )
									ret := 0.285588
								if( smoothK_k > 80.8394 )
									ret := 0.711340 // buy
						if( bullPower > -0.0629 )
							if( smoothK_k <= 51.6452 )
								if( smoothD_d <= 41.3662 )
									ret := -0.608696
								if( smoothD_d > 41.3662 )
									ret := 0.384615
							if( smoothK_k > 51.6452 )
								if( bearPower <= -0.973 )
									ret := -0.427300
								if( bearPower > -0.973 )
									ret := -0.193684
					if( bearPower > -0.645826 )
						if( bearPower <= 0.003364 )
							if( bbp <= -0.020149 )
								if( rsi1 <= 36.357 )
									ret := -0.329285
								if( rsi1 > 36.357 )
									ret := -0.093673
							if( bbp > -0.020149 )
								if( bearPower <= -0.149507 )
									ret := -0.580402
								if( bearPower > -0.149507 )
									ret := -0.302540
						if( bearPower > 0.003364 )
							if( rsi1 <= 39.1558 )
								if( k <= 60.8741 )
									ret := -0.666667
								if( k > 60.8741 )
									ret := 0.000000
							if( rsi1 > 39.1558 )
								if( d_k <= 16.6151 )
									ret := -0.787037 // sell
								if( d_k > 16.6151 )
									ret := -0.100000
				if( rsi1 > 44.1446 )
					if( d_k <= -10.7137 )
						if( BBPower_Color <= 0.5 )
							if( bbm <= 0.318911 )
								if( smoothD_d <= 67.6371 )
									ret := 0.111776
								if( smoothD_d > 67.6371 )
									ret := -0.082192
							if( bbm > 0.318911 )
								if( bullPower <= -0.120301 )
									ret := 0.699104
								if( bullPower > -0.120301 )
									ret := 0.349934
						if( BBPower_Color > 0.5 )
							if( smoothD_d <= 65.8567 )
								if( d_k <= -11.0544 )
									ret := -0.248299
								if( d_k > -11.0544 )
									ret := 0.545455
							if( smoothD_d > 65.8567 )
								if( smoothK_k <= 81.3648 )
									ret := -0.370370
								if( smoothK_k > 81.3648 )
									ret := 0.279412
					if( d_k > -10.7137 )
						if( bbp <= -0.25244 )
							if( smoothD_d <= 51.1717 )
								if( bearPower <= -0.471977 )
									ret := 0.800000 // buy
								if( bearPower > -0.471977 )
									ret := 0.253012
							if( smoothD_d > 51.1717 )
								if( rsi1 <= 54.5543 )
									ret := 0.340147
								if( rsi1 > 54.5543 )
									ret := 0.593949
						if( bbp > -0.25244 )
							if( d_k <= 17.3821 )
								if( bbp <= 0.52665 )
									ret := -0.034217
								if( bbp > 0.52665 )
									ret := -0.399916
							if( d_k > 17.3821 )
								if( bbp <= 0.069829 )
									ret := 0.697674
								if( bbp > 0.069829 )
									ret := 0.126087
			if( rsi1 > 57.8992 )
				if( rsi1 <= 73.6901 )
					if( bullPower <= 0.599804 )
						if( bbp <= -0.050057 )
							if( bbp <= -0.469585 )
								if( bullPower <= 0.463634 )
									ret := 0.828610 // buy
								if( bullPower > 0.463634 )
									ret := 0.214286
							if( bbp > -0.469585 )
								if( bearPower <= -0.21826 )
									ret := 0.618251
								if( bearPower > -0.21826 )
									ret := 0.338843
						if( bbp > -0.050057 )
							if( BBPower_Color <= 0.5 )
								if( k <= 75.5154 )
									ret := 0.434066
								if( k > 75.5154 )
									ret := 0.680120
							if( BBPower_Color > 0.5 )
								if( d_k <= 1.0805 )
									ret := 0.114443
								if( d_k > 1.0805 )
									ret := 0.281174
					if( bullPower > 0.599804 )
						if( bearPower <= 0.169694 )
							if( BBPower_Color <= 0.5 )
								if( d_k <= -0.130053 )
									ret := 0.784091 // buy
								if( d_k > -0.130053 )
									ret := 0.233083
							if( BBPower_Color > 0.5 )
								if( smoothK_k <= 66.8864 )
									ret := 0.266913
								if( smoothK_k > 66.8864 )
									ret := 0.086511
						if( bearPower > 0.169694 )
							if( d_k <= 4.16586 )
								if( d <= 90.266 )
									ret := -0.144105
								if( d > 90.266 )
									ret := -0.423237
							if( d_k > 4.16586 )
								if( smoothD_d <= 71.4658 )
									ret := -0.127103
								if( smoothD_d > 71.4658 )
									ret := 0.240087
				if( rsi1 > 73.6901 )
					if( BBPower_Color <= 0.5 )
						if( smoothK_k <= 69.1159 )
							if( d_k <= 3.3557 )
								ret := 1.000000 // buy
							if( d_k > 3.3557 )
								ret := -0.785714 // sell
						if( smoothK_k > 69.1159 )
							if( bearPower <= -0.549942 )
								ret := 0.800000 // buy
							if( bearPower > -0.549942 )
								if( bbp <= -0.260428 )
									ret := 0.846154 // buy
								if( bbp > -0.260428 )
									ret := 0.991803 // buy
					if( BBPower_Color > 0.5 )
						if( bullPower <= 5.85384 )
							if( bearPower <= 0.184272 )
								if( d_k <= -18.7139 )
									ret := 0.169014
								if( d_k > -18.7139 )
									ret := 0.614922
							if( bearPower > 0.184272 )
								if( d <= 93.6645 )
									ret := 0.309942
								if( d > 93.6645 )
									ret := 0.621875
						if( bullPower > 5.85384 )
							if( smoothD_d <= 74.881 )
								ret := -0.555556
							if( smoothD_d > 74.881 )
								ret := -1.000000 // sell
		if( smoothK_k > 89.4517 )
			if( rsi1 <= 74.1183 )
				if( rsi1 <= 56.3009 )
					if( bullPower <= -0.011795 )
						if( rsi1 <= 35.6734 )
							if( bbm <= 1.53642 )
								if( bullPower <= -1.20163 )
									ret := 0.666667
								if( bullPower > -1.20163 )
									ret := -0.374150
							if( bbm > 1.53642 )
								if( k <= 94.5945 )
									ret := 1.000000 // buy
								if( k > 94.5945 )
									ret := 0.846154 // buy
						if( rsi1 > 35.6734 )
							if( bbp <= -0.716051 )
								if( d_k <= -2.72504 )
									ret := 0.686406
								if( d_k > -2.72504 )
									ret := 0.507726
							if( bbp > -0.716051 )
								if( bearPower <= -0.614304 )
									ret := 0.928571 // buy
								if( bearPower > -0.614304 )
									ret := 0.232759
					if( bullPower > -0.011795 )
						if( bearPower <= -0.170432 )
							if( rsi1 <= 47.5181 )
								if( bullPower <= 1.03346 )
									ret := -0.090909
								if( bullPower > 1.03346 )
									ret := 1.000000 // buy
							if( rsi1 > 47.5181 )
								if( bbp <= 0.002529 )
									ret := 0.289231
								if( bbp > 0.002529 )
									ret := -0.053398
						if( bearPower > -0.170432 )
							if( rsi1 <= 45.7658 )
								if( bullPower <= 0.616996 )
									ret := 0.403226
								if( bullPower > 0.616996 )
									ret := -0.230769
							if( rsi1 > 45.7658 )
								if( d <= 77.6373 )
									ret := 0.391304
								if( d > 77.6373 )
									ret := -0.186861
				if( rsi1 > 56.3009 )
					if( bearPower <= -0.145508 )
						if( bearPower <= -0.308585 )
							if( bbp <= 0.406208 )
								if( rsi1 <= 62.791 )
									ret := 0.745152 // buy
								if( rsi1 > 62.791 )
									ret := 0.900437 // buy
							if( bbp > 0.406208 )
								if( k <= 95.6942 )
									ret := -0.666667
								if( k > 95.6942 )
									ret := 0.246154
						if( bearPower > -0.308585 )
							if( rsi1 <= 64.0021 )
								if( k <= 98.2403 )
									ret := 0.471642
								if( k > 98.2403 )
									ret := 0.104712
							if( rsi1 > 64.0021 )
								if( bullPower <= 0.899387 )
									ret := 0.715232 // buy
								if( bullPower > 0.899387 )
									ret := 0.210526
					if( bearPower > -0.145508 )
						if( rsi1 <= 67.9704 )
							if( bullPower <= 2.17228 )
								if( bullPower <= 2.12064 )
									ret := 0.077388
								if( bullPower > 2.12064 )
									ret := 1.000000 // buy
							if( bullPower > 2.17228 )
								if( bbm <= 1.24677 )
									ret := -0.812500 // sell
								if( bbm > 1.24677 )
									ret := -0.121739
						if( rsi1 > 67.9704 )
							if( bearPower <= 0.155853 )
								if( smoothK_k <= 91.6512 )
									ret := 0.732639 // buy
								if( smoothK_k > 91.6512 )
									ret := 0.447561
							if( bearPower > 0.155853 )
								if( bbm <= 0.411982 )
									ret := 0.231707
								if( bbm > 0.411982 )
									ret := -0.005381
			if( rsi1 > 74.1183 )
				if( bbm <= 1.77123 )
					if( rsi1 <= 80.0026 )
						if( bullPower <= 0.818239 )
							if( BBPower_Color <= 0.5 )
								if( bbm <= 0.10298 )
									ret := 0.500000
								if( bbm > 0.10298 )
									ret := 0.962264 // buy
							if( BBPower_Color > 0.5 )
								if( d_k <= 0.745089 )
									ret := 0.614922
								if( d_k > 0.745089 )
									ret := 0.756522 // buy
						if( bullPower > 0.818239 )
							if( bearPower <= 0.275169 )
								if( bbp <= 1.6855 )
									ret := 0.628440
								if( bbp > 1.6855 )
									ret := -0.150000
							if( bearPower > 0.275169 )
								if( d_k <= -14.7079 )
									ret := 0.818182 // buy
								if( d_k > -14.7079 )
									ret := 0.125198
					if( rsi1 > 80.0026 )
						if( k <= 99.4394 )
							if( smoothD_d <= 92.249 )
								if( bbp <= 1.47854 )
									ret := 0.747292 // buy
								if( bbp > 1.47854 )
									ret := 0.307692
							if( smoothD_d > 92.249 )
								if( bearPower <= 0.252289 )
									ret := 0.893557 // buy
								if( bearPower > 0.252289 )
									ret := 0.610028
						if( k > 99.4394 )
							if( bullPower <= 0.770969 )
								if( k <= 99.5937 )
									ret := 0.555556
								if( k > 99.5937 )
									ret := 0.870400 // buy
							if( bullPower > 0.770969 )
								if( d_k <= -9.69235 )
									ret := 0.275000
								if( d_k > -9.69235 )
									ret := 0.689295
				if( bbm > 1.77123 )
					if( rsi1 <= 80.9937 )
						if( d <= 97.7422 )
							if( smoothK_k <= 96.4518 )
								if( bearPower <= 0.754288 )
									ret := 0.705882 // buy
								if( bearPower > 0.754288 )
									ret := -0.260870
							if( smoothK_k > 96.4518 )
								ret := 0.909091 // buy
						if( d > 97.7422 )
							if( bbm <= 1.94782 )
								ret := -0.850000 // sell
							if( bbm > 1.94782 )
								if( rsi1 <= 78.7595 )
									ret := -0.410256
								if( rsi1 > 78.7595 )
									ret := 0.789474 // buy
					if( rsi1 > 80.9937 )
						if( d <= 93.0615 )
							if( d_k <= -7.14042 )
								ret := 0.625000
							if( d_k > -7.14042 )
								ret := -0.529412
						if( d > 93.0615 )
							if( k <= 99.6712 )
								if( rsi1 <= 93.0383 )
									ret := 0.979381 // buy
								if( rsi1 > 93.0383 )
									ret := 0.625000
							if( k > 99.6712 )
								if( d_k <= -1.02631 )
									ret := -0.210526
								if( d_k > -1.02631 )
									ret := 0.724138 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_AAVEUSDT_15Min_45a2c0db(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


