//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: ATOMUSDT_30Min_2BS0_a3308e2e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_30Min_2BS0_a3308e2e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_30Min_a3308e2e(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( smoothK_k <= 28.4291 )
		if( rsi1 <= 38.839 )
			if( bullPower <= 0.016373 )
				if( rsi1 <= 22.0332 )
					if( bbm <= 0.087044 )
						if( bullPower <= -0.071669 )
							if( rsi1 <= 15.4175 )
								if( rsi1 <= 8.39684 )
									ret := -0.750000 // sell
								if( rsi1 > 8.39684 )
									ret := -0.320000
							if( rsi1 > 15.4175 )
								if( smoothK_k <= 22.6771 )
									ret := 0.000000
								if( smoothK_k > 22.6771 )
									ret := 0.857143 // buy
						if( bullPower > -0.071669 )
							if( bbm <= 0.042226 )
								if( bearPower <= -0.098755 )
									ret := -0.900000 // sell
								if( bearPower > -0.098755 )
									ret := -0.330247
							if( bbm > 0.042226 )
								if( rsi1 <= 16.3817 )
									ret := -0.720238 // sell
								if( rsi1 > 16.3817 )
									ret := -0.498233
					if( bbm > 0.087044 )
						if( d_k <= -3.33521 )
							if( rsi1 <= 17.0278 )
								if( smoothK_k <= 7.73506 )
									ret := -0.960000 // sell
								if( smoothK_k > 7.73506 )
									ret := -0.744681 // sell
							if( rsi1 > 17.0278 )
								if( bullPower <= -0.196155 )
									ret := 0.155556
								if( bullPower > -0.196155 )
									ret := -0.389610
						if( d_k > -3.33521 )
							if( rsi1 <= 15.9449 )
								if( bearPower <= -0.227644 )
									ret := -0.861204 // sell
								if( bearPower > -0.227644 )
									ret := -0.709677 // sell
							if( rsi1 > 15.9449 )
								if( bbm <= 0.220197 )
									ret := -0.571429
								if( bbm > 0.220197 )
									ret := -0.711864 // sell
				if( rsi1 > 22.0332 )
					if( d_k <= -3.33031 )
						if( bearPower <= -0.294724 )
							if( rsi1 <= 27.6274 )
								if( bullPower <= -0.101796 )
									ret := 0.113208
								if( bullPower > -0.101796 )
									ret := -0.576923
							if( rsi1 > 27.6274 )
								if( smoothD_d <= 20.1317 )
									ret := 0.465680
								if( smoothD_d > 20.1317 )
									ret := -0.500000
						if( bearPower > -0.294724 )
							if( bullPower <= -0.077826 )
								if( smoothD_d <= 13.832 )
									ret := 0.055000
								if( smoothD_d > 13.832 )
									ret := 0.369048
							if( bullPower > -0.077826 )
								if( smoothD_d <= -1.15927 )
									ret := -0.933333 // sell
								if( smoothD_d > -1.15927 )
									ret := -0.236667
					if( d_k > -3.33031 )
						if( rsi1 <= 32.083 )
							if( bbm <= 0.074852 )
								if( bbp <= -0.412448 )
									ret := 0.833333 // buy
								if( bbp > -0.412448 )
									ret := -0.222312
							if( bbm > 0.074852 )
								if( bullPower <= -0.0479 )
									ret := -0.388857
								if( bullPower > -0.0479 )
									ret := -0.589852
						if( rsi1 > 32.083 )
							if( d_k <= 15.1507 )
								if( bullPower <= -0.033531 )
									ret := -0.017192
								if( bullPower > -0.033531 )
									ret := -0.191781
							if( d_k > 15.1507 )
								if( bearPower <= -0.136819 )
									ret := -0.656250
								if( bearPower > -0.136819 )
									ret := -0.205298
			if( bullPower > 0.016373 )
				if( bullPower <= 0.052887 )
					if( rsi1 <= 31.7655 )
						if( BBPower_Color <= 0.5 )
							if( d_k <= 7.31482 )
								if( bbp <= 0.000111 )
									ret := -0.720207 // sell
								if( bbp > 0.000111 )
									ret := -1.000000 // sell
							if( d_k > 7.31482 )
								if( bearPower <= -0.094263 )
									ret := -0.977528 // sell
								if( bearPower > -0.094263 )
									ret := -0.843137 // sell
						if( BBPower_Color > 0.5 )
							if( smoothD_d <= 0.491208 )
								if( bbp <= 0.032994 )
									ret := -0.714286 // sell
								if( bbp > 0.032994 )
									ret := -0.434783
							if( smoothD_d > 0.491208 )
								if( bbp <= 0.042918 )
									ret := -0.349593
								if( bbp > 0.042918 )
									ret := -0.666667
					if( rsi1 > 31.7655 )
						if( bbm <= 0.242619 )
							if( bbm <= 0.096448 )
								if( bbm <= 0.030193 )
									ret := -0.142857
								if( bbm > 0.030193 )
									ret := -0.424490
							if( bbm > 0.096448 )
								if( bbm <= 0.207961 )
									ret := -0.679688
								if( bbm > 0.207961 )
									ret := -0.372093
						if( bbm > 0.242619 )
							if( d_k <= 0.963733 )
								if( d_k <= 0.152059 )
									ret := -0.055556
								if( d_k > 0.152059 )
									ret := 0.777778 // buy
							if( d_k > 0.963733 )
								if( smoothK_k <= 7.01346 )
									ret := -0.666667
								if( smoothK_k > 7.01346 )
									ret := -0.052632
				if( bullPower > 0.052887 )
					if( d_k <= 3.38438 )
						if( k <= 17.1259 )
							if( bearPower <= -0.234956 )
								if( rsi1 <= 35.2037 )
									ret := -0.653595
								if( rsi1 > 35.2037 )
									ret := -0.178571
							if( bearPower > -0.234956 )
								if( rsi1 <= 27.914 )
									ret := -0.964706 // sell
								if( rsi1 > 27.914 )
									ret := -0.728155 // sell
						if( k > 17.1259 )
							if( bbp <= -0.15764 )
								if( smoothK_k <= 23.5909 )
									ret := 0.071429
								if( smoothK_k > 23.5909 )
									ret := 1.000000 // buy
							if( bbp > -0.15764 )
								if( bullPower <= 0.118371 )
									ret := -0.744681 // sell
								if( bullPower > 0.118371 )
									ret := -0.281250
					if( d_k > 3.38438 )
						if( rsi1 <= 34.0965 )
							if( BBPower_Color <= 0.5 )
								if( bullPower <= 0.094606 )
									ret := -0.897436 // sell
								if( bullPower > 0.094606 )
									ret := -0.973770 // sell
							if( BBPower_Color > 0.5 )
								if( bullPower <= 0.062451 )
									ret := -0.714286 // sell
								if( bullPower > 0.062451 )
									ret := -0.911538 // sell
						if( rsi1 > 34.0965 )
							if( bbp <= 0.037445 )
								if( k <= 17.0863 )
									ret := -0.633484
								if( k > 17.0863 )
									ret := -0.871795 // sell
							if( bbp > 0.037445 )
								if( BBPower_Color <= 0.5 )
									ret := -1.000000 // sell
								if( BBPower_Color > 0.5 )
									ret := -0.830065 // sell
		if( rsi1 > 38.839 )
			if( bearPower <= -0.109589 )
				if( d_k <= -1.83067 )
					if( d <= 6.02374 )
						if( bullPower <= -0.028056 )
							if( rsi1 <= 44.6229 )
								if( smoothD_d <= 0.930954 )
									ret := -0.250000
								if( smoothD_d > 0.930954 )
									ret := 0.343750
							if( rsi1 > 44.6229 )
								if( k <= 12.8424 )
									ret := 0.722222 // buy
								if( k > 12.8424 )
									ret := -0.250000
						if( bullPower > -0.028056 )
							if( rsi1 <= 49.244 )
								if( bullPower <= 0.160468 )
									ret := -0.484127
								if( bullPower > 0.160468 )
									ret := 0.400000
							if( rsi1 > 49.244 )
								if( d <= 2.55415 )
									ret := -0.250000
								if( d > 2.55415 )
									ret := 0.522727
					if( d > 6.02374 )
						if( rsi1 <= 43.1755 )
							if( bbp <= -0.205217 )
								if( d <= 11.5204 )
									ret := 0.190840
								if( d > 11.5204 )
									ret := 0.544484
							if( bbp > -0.205217 )
								if( smoothD_d <= 12.1157 )
									ret := -0.204819
								if( smoothD_d > 12.1157 )
									ret := 0.303571
						if( rsi1 > 43.1755 )
							if( rsi1 <= 55.5053 )
								if( bearPower <= -0.454208 )
									ret := 0.821053 // buy
								if( bearPower > -0.454208 )
									ret := 0.500000
							if( rsi1 > 55.5053 )
								if( d_k <= -3.22065 )
									ret := 0.900000 // buy
								if( d_k > -3.22065 )
									ret := 0.583333
				if( d_k > -1.83067 )
					if( bullPower <= 0.024647 )
						if( rsi1 <= 41.8779 )
							if( k <= 6.87208 )
								if( bbp <= -0.544952 )
									ret := 0.964286 // buy
								if( bbp > -0.544952 )
									ret := 0.201923
							if( k > 6.87208 )
								if( d_k <= -0.851246 )
									ret := 0.571429
								if( d_k > -0.851246 )
									ret := -0.263158
						if( rsi1 > 41.8779 )
							if( smoothD_d <= 39.8964 )
								if( smoothD_d <= -2.66491 )
									ret := -1.000000 // sell
								if( smoothD_d > -2.66491 )
									ret := 0.394737
							if( smoothD_d > 39.8964 )
								if( smoothD_d <= 47.8888 )
									ret := -0.928571 // sell
								if( smoothD_d > 47.8888 )
									ret := 0.500000
					if( bullPower > 0.024647 )
						if( rsi1 <= 54.7952 )
							if( d_k <= 4.23748 )
								if( rsi1 <= 47.0798 )
									ret := -0.251497
								if( rsi1 > 47.0798 )
									ret := 0.153061
							if( d_k > 4.23748 )
								if( bullPower <= 0.207085 )
									ret := -0.406948
								if( bullPower > 0.207085 )
									ret := -0.669528
						if( rsi1 > 54.7952 )
							if( bbp <= 0.622283 )
								if( d <= 36.5892 )
									ret := 0.703030 // buy
								if( d > 36.5892 )
									ret := 0.062500
							if( bbp > 0.622283 )
								ret := -0.714286 // sell
			if( bearPower > -0.109589 )
				if( bullPower <= 0.115107 )
					if( rsi1 <= 50.4796 )
						if( bbm <= 0.075375 )
							if( bullPower <= 0.041792 )
								if( k <= 3.93145 )
									ret := 0.100313
								if( k > 3.93145 )
									ret := -0.042897
							if( bullPower > 0.041792 )
								if( rsi1 <= 42.1184 )
									ret := -0.420118
								if( rsi1 > 42.1184 )
									ret := -0.203629
						if( bbm > 0.075375 )
							if( bullPower <= 0.053546 )
								if( rsi1 <= 45.8712 )
									ret := -0.183908
								if( rsi1 > 45.8712 )
									ret := 0.186722
							if( bullPower > 0.053546 )
								if( d_k <= 6.18051 )
									ret := -0.344383
								if( d_k > 6.18051 )
									ret := -0.560261
					if( rsi1 > 50.4796 )
						if( bearPower <= -0.033853 )
							if( rsi1 <= 58.1707 )
								if( k <= 20.281 )
									ret := 0.429032
								if( k > 20.281 )
									ret := 0.110526
							if( rsi1 > 58.1707 )
								if( smoothD_d <= 19.4141 )
									ret := 0.801980 // buy
								if( smoothD_d > 19.4141 )
									ret := 0.400000
						if( bearPower > -0.033853 )
							if( BBPower_Color <= 0.5 )
								if( bbp <= -2.4e-05 )
									ret := 0.085714
								if( bbp > -2.4e-05 )
									ret := 0.456790
							if( BBPower_Color > 0.5 )
								if( rsi1 <= 69.0686 )
									ret := 0.018253
								if( rsi1 > 69.0686 )
									ret := 0.505882
				if( bullPower > 0.115107 )
					if( rsi1 <= 63.3532 )
						if( d_k <= 4.575 )
							if( bearPower <= -0.013527 )
								if( rsi1 <= 49.8306 )
									ret := -0.457692
								if( rsi1 > 49.8306 )
									ret := 0.165992
							if( bearPower > -0.013527 )
								if( rsi1 <= 52.5546 )
									ret := -0.523909
								if( rsi1 > 52.5546 )
									ret := -0.257669
						if( d_k > 4.575 )
							if( rsi1 <= 49.4089 )
								if( bbp <= 0.292284 )
									ret := -0.786000 // sell
								if( bbp > 0.292284 )
									ret := -0.935556 // sell
							if( rsi1 > 49.4089 )
								if( bearPower <= 0.039211 )
									ret := -0.260771
								if( bearPower > 0.039211 )
									ret := -0.646512
					if( rsi1 > 63.3532 )
						if( bearPower <= 0.501251 )
							if( rsi1 <= 65.8467 )
								if( bbp <= 0.465776 )
									ret := 0.225000
								if( bbp > 0.465776 )
									ret := -0.233766
							if( rsi1 > 65.8467 )
								if( bbm <= 0.109977 )
									ret := 0.117647
								if( bbm > 0.109977 )
									ret := 0.500000
						if( bearPower > 0.501251 )
							if( rsi1 <= 68.3261 )
								if( bbm <= 0.370114 )
									ret := -0.600000
								if( bbm > 0.370114 )
									ret := -0.916667 // sell
							if( rsi1 > 68.3261 )
								if( smoothD_d <= 41.9739 )
									ret := 0.142857
								if( smoothD_d > 41.9739 )
									ret := -0.500000
	if( smoothK_k > 28.4291 )
		if( d_k <= 3.91309 )
			if( rsi1 <= 58.3598 )
				if( bbp <= -0.121109 )
					if( d_k <= -2.91529 )
						if( rsi1 <= 35.7176 )
							if( bullPower <= -0.131823 )
								if( rsi1 <= 27.1135 )
									ret := -0.053254
								if( rsi1 > 27.1135 )
									ret := 0.393617
							if( bullPower > -0.131823 )
								if( d_k <= -15.708 )
									ret := -0.360465
								if( d_k > -15.708 )
									ret := -0.057245
						if( rsi1 > 35.7176 )
							if( rsi1 <= 48.7824 )
								if( bbp <= -0.235701 )
									ret := 0.619690
								if( bbp > -0.235701 )
									ret := 0.241966
							if( rsi1 > 48.7824 )
								if( bbp <= -0.296391 )
									ret := 0.858883 // buy
								if( bbp > -0.296391 )
									ret := 0.687764
					if( d_k > -2.91529 )
						if( rsi1 <= 44.5296 )
							if( bullPower <= -0.036728 )
								if( bearPower <= -0.73752 )
									ret := -0.308271
								if( bearPower > -0.73752 )
									ret := 0.112805
							if( bullPower > -0.036728 )
								if( rsi1 <= 36.9507 )
									ret := -0.734940 // sell
								if( rsi1 > 36.9507 )
									ret := -0.205298
						if( rsi1 > 44.5296 )
							if( rsi1 <= 47.5991 )
								if( k <= 91.1698 )
									ret := 0.105590
								if( k > 91.1698 )
									ret := 0.700000 // buy
							if( rsi1 > 47.5991 )
								if( bullPower <= 0.117151 )
									ret := 0.634109
								if( bullPower > 0.117151 )
									ret := -0.185185
				if( bbp > -0.121109 )
					if( bearPower <= -0.051596 )
						if( rsi1 <= 49.0564 )
							if( bullPower <= 0.114096 )
								if( bbp <= -0.038341 )
									ret := -0.037124
								if( bbp > -0.038341 )
									ret := -0.219941
							if( bullPower > 0.114096 )
								if( d_k <= -4.62615 )
									ret := -0.161850
								if( d_k > -4.62615 )
									ret := -0.558209
						if( rsi1 > 49.0564 )
							if( bbp <= 0.117154 )
								if( bbm <= 0.06129 )
									ret := 0.177489
								if( bbm > 0.06129 )
									ret := 0.483275
							if( bbp > 0.117154 )
								if( d_k <= -9.7499 )
									ret := 0.536232
								if( d_k > -9.7499 )
									ret := -0.029289
					if( bearPower > -0.051596 )
						if( bbp <= 0.109192 )
							if( rsi1 <= 50.8307 )
								if( bbm <= 0.104067 )
									ret := -0.095754
								if( bbm > 0.104067 )
									ret := -0.448485
							if( rsi1 > 50.8307 )
								if( bearPower <= -0.016475 )
									ret := 0.126784
								if( bearPower > -0.016475 )
									ret := -0.042620
						if( bbp > 0.109192 )
							if( rsi1 <= 51.5051 )
								if( bbm <= 0.318381 )
									ret := -0.463977
								if( bbm > 0.318381 )
									ret := -0.839623 // sell
							if( rsi1 > 51.5051 )
								if( BBPower_Color <= 0.5 )
									ret := 0.352381
								if( BBPower_Color > 0.5 )
									ret := -0.247423
			if( rsi1 > 58.3598 )
				if( bearPower <= -0.03364 )
					if( bbm <= 0.068039 )
						if( smoothD_d <= 94.283 )
							if( bbm <= 0.042074 )
								if( rsi1 <= 80.9882 )
									ret := 0.297297
								if( rsi1 > 80.9882 )
									ret := 1.000000 // buy
							if( bbm > 0.042074 )
								if( d_k <= 3.42994 )
									ret := 0.515528
								if( d_k > 3.42994 )
									ret := -0.166667
						if( smoothD_d > 94.283 )
							if( bearPower <= -0.058456 )
								if( k <= 99.9989 )
									ret := 1.000000 // buy
								if( k > 99.9989 )
									ret := 0.812500 // buy
							if( bearPower > -0.058456 )
								if( bbp <= -0.031977 )
									ret := 0.500000
								if( bbp > -0.031977 )
									ret := 0.923077 // buy
					if( bbm > 0.068039 )
						if( d_k <= -8.86502 )
							if( bearPower <= -0.115043 )
								if( bullPower <= 1.15716 )
									ret := 0.934974 // buy
								if( bullPower > 1.15716 )
									ret := 0.200000
							if( bearPower > -0.115043 )
								if( rsi1 <= 64.3854 )
									ret := 0.699360
								if( rsi1 > 64.3854 )
									ret := 0.889888 // buy
						if( d_k > -8.86502 )
							if( rsi1 <= 67.8229 )
								if( bullPower <= -0.17791 )
									ret := -0.200000
								if( bullPower > -0.17791 )
									ret := 0.690978
							if( rsi1 > 67.8229 )
								if( bbm <= 0.09301 )
									ret := 0.670330
								if( bbm > 0.09301 )
									ret := 0.877108 // buy
				if( bearPower > -0.03364 )
					if( bbm <= 0.081233 )
						if( smoothD_d <= 82.3938 )
							if( bearPower <= -0.007533 )
								if( bbm <= 0.056181 )
									ret := 0.169118
								if( bbm > 0.056181 )
									ret := 0.477778
							if( bearPower > -0.007533 )
								if( bbm <= 0.044021 )
									ret := 0.014739
								if( bbm > 0.044021 )
									ret := 0.131818
						if( smoothD_d > 82.3938 )
							if( rsi1 <= 76.162 )
								if( BBPower_Color <= 0.5 )
									ret := 0.382759
								if( BBPower_Color > 0.5 )
									ret := 0.164526
							if( rsi1 > 76.162 )
								if( bearPower <= 0.089271 )
									ret := 0.498973
								if( bearPower > 0.089271 )
									ret := 0.050000
					if( bbm > 0.081233 )
						if( smoothK_k <= 93.1314 )
							if( rsi1 <= 72.3362 )
								if( BBPower_Color <= 0.5 )
									ret := 0.873684 // buy
								if( BBPower_Color > 0.5 )
									ret := 0.269348
							if( rsi1 > 72.3362 )
								if( d_k <= -3.71425 )
									ret := 0.738983 // buy
								if( d_k > -3.71425 )
									ret := 0.483405
						if( smoothK_k > 93.1314 )
							if( rsi1 <= 72.9107 )
								if( bullPower <= 0.669549 )
									ret := 0.512526
								if( bullPower > 0.669549 )
									ret := 0.204724
							if( rsi1 > 72.9107 )
								if( bbp <= 0.222058 )
									ret := 0.847545 // buy
								if( bbp > 0.222058 )
									ret := 0.724891 // buy
		if( d_k > 3.91309 )
			if( rsi1 <= 54.2657 )
				if( bullPower <= 0.095037 )
					if( bbm <= 0.079368 )
						if( bullPower <= 0.037111 )
							if( smoothD_d <= 57.3843 )
								if( bullPower <= -0.044986 )
									ret := 0.297297
								if( bullPower > -0.044986 )
									ret := -0.132948
							if( smoothD_d > 57.3843 )
								if( bearPower <= -0.066961 )
									ret := 0.241525
								if( bearPower > -0.066961 )
									ret := 0.017769
						if( bullPower > 0.037111 )
							if( rsi1 <= 49.1059 )
								if( BBPower_Color <= 0.5 )
									ret := -0.909091 // sell
								if( BBPower_Color > 0.5 )
									ret := -0.330709
							if( rsi1 > 49.1059 )
								if( d_k <= 11.4754 )
									ret := -0.178571
								if( d_k > 11.4754 )
									ret := 0.010753
					if( bbm > 0.079368 )
						if( rsi1 <= 44.7342 )
							if( bbp <= -0.076365 )
								if( bbm <= 0.138786 )
									ret := -0.136729
								if( bbm > 0.138786 )
									ret := -0.453917
							if( bbp > -0.076365 )
								if( rsi1 <= 37.9774 )
									ret := -0.787500 // sell
								if( rsi1 > 37.9774 )
									ret := -0.529412
						if( rsi1 > 44.7342 )
							if( bbp <= -0.040704 )
								if( bullPower <= 0.019744 )
									ret := 0.505556
								if( bullPower > 0.019744 )
									ret := 0.141631
							if( bbp > -0.040704 )
								if( rsi1 <= 51.218 )
									ret := -0.293478
								if( rsi1 > 51.218 )
									ret := 0.070796
				if( bullPower > 0.095037 )
					if( bbp <= 0.167348 )
						if( d <= 97.2176 )
							if( bbm <= 0.143421 )
								if( rsi1 <= 52.0757 )
									ret := -0.480000
								if( rsi1 > 52.0757 )
									ret := -0.056604
							if( bbm > 0.143421 )
								if( rsi1 <= 45.1216 )
									ret := -0.842342 // sell
								if( rsi1 > 45.1216 )
									ret := -0.347826
						if( d > 97.2176 )
							if( d <= 97.7849 )
								ret := 1.000000 // buy
							if( d > 97.7849 )
								ret := 0.400000
					if( bbp > 0.167348 )
						if( rsi1 <= 48.5158 )
							if( rsi1 <= 44.5073 )
								if( bullPower <= 0.288916 )
									ret := -0.855422 // sell
								if( bullPower > 0.288916 )
									ret := -0.973958 // sell
							if( rsi1 > 44.5073 )
								if( d_k <= 6.72585 )
									ret := -0.650000
								if( d_k > 6.72585 )
									ret := -0.875472 // sell
						if( rsi1 > 48.5158 )
							if( bearPower <= -0.251924 )
								if( k <= 69.6223 )
									ret := 0.625000
								if( k > 69.6223 )
									ret := -0.750000 // sell
							if( bearPower > -0.251924 )
								if( bullPower <= 0.375828 )
									ret := -0.619423
								if( bullPower > 0.375828 )
									ret := -0.861842 // sell
			if( rsi1 > 54.2657 )
				if( bearPower <= 0.069441 )
					if( rsi1 <= 68.5457 )
						if( BBPower_Color <= 0.5 )
							if( bbm <= 0.056122 )
								if( d_k <= 23.7666 )
									ret := 0.258373
								if( d_k > 23.7666 )
									ret := -0.750000 // sell
							if( bbm > 0.056122 )
								if( smoothD_d <= 42.0952 )
									ret := 0.000000
								if( smoothD_d > 42.0952 )
									ret := 0.556465
						if( BBPower_Color > 0.5 )
							if( bbp <= 0.37001 )
								if( rsi1 <= 59.4375 )
									ret := -0.006809
								if( rsi1 > 59.4375 )
									ret := 0.187117
							if( bbp > 0.37001 )
								if( rsi1 <= 58.9394 )
									ret := -0.641304
								if( rsi1 > 58.9394 )
									ret := -0.043478
					if( rsi1 > 68.5457 )
						if( bbm <= 0.046398 )
							if( rsi1 <= 79.6458 )
								if( BBPower_Color <= 0.5 )
									ret := 0.636364
								if( BBPower_Color > 0.5 )
									ret := 0.237037
							if( rsi1 > 79.6458 )
								if( bbm <= 0.0365 )
									ret := 0.812500 // buy
								if( bbm > 0.0365 )
									ret := 0.166667
						if( bbm > 0.046398 )
							if( rsi1 <= 74.4616 )
								if( bearPower <= -0.018163 )
									ret := 0.805556 // buy
								if( bearPower > -0.018163 )
									ret := 0.435374
							if( rsi1 > 74.4616 )
								if( bearPower <= 0.053584 )
									ret := 0.730570 // buy
								if( bearPower > 0.053584 )
									ret := 0.441860
				if( bearPower > 0.069441 )
					if( rsi1 <= 65.8382 )
						if( smoothK_k <= 86.0633 )
							if( bearPower <= 0.162029 )
								if( smoothD_d <= 53.2062 )
									ret := -0.109756
								if( smoothD_d > 53.2062 )
									ret := -0.544423
							if( bearPower > 0.162029 )
								if( d_k <= 10.0343 )
									ret := -0.605364
								if( d_k > 10.0343 )
									ret := -0.793296 // sell
						if( smoothK_k > 86.0633 )
							if( bearPower <= 0.134094 )
								if( rsi1 <= 58.5127 )
									ret := -0.928571 // sell
								if( rsi1 > 58.5127 )
									ret := 0.285714
							if( bearPower > 0.134094 )
								if( rsi1 <= 59.7668 )
									ret := 0.818182 // buy
								if( rsi1 > 59.7668 )
									ret := 0.230769
					if( rsi1 > 65.8382 )
						if( bearPower <= 0.232973 )
							if( smoothK_k <= 79.5153 )
								if( rsi1 <= 71.1033 )
									ret := -0.134868
								if( rsi1 > 71.1033 )
									ret := 0.333333
							if( smoothK_k > 79.5153 )
								if( bbm <= 0.168958 )
									ret := 0.345324
								if( bbm > 0.168958 )
									ret := 0.621212
						if( bearPower > 0.232973 )
							if( bbp <= 1.96402 )
								if( k <= 86.7741 )
									ret := -0.212264
								if( k > 86.7741 )
									ret := 0.301370
							if( bbp > 1.96402 )
								if( d <= 94.2935 )
									ret := -0.645570
								if( d > 94.2935 )
									ret := 0.250000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_ATOMUSDT_30Min_a3308e2e(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


