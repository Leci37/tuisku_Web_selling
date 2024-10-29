//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: APPS_15Min_2BB0_e2ad2be5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_APPS_15Min_2BB0_e2ad2be5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_APPS_15Min_e2ad2be5(Upper_Band, basis, Lower_Band, bullPower, bbp, bearPower, bbm, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bearPower <= 0.011244 )
		if( bbm <= 0.009797 )
			if( bbp <= -0.009949 )
				if( Upper_Band <= 6.68731 )
					if( bullPower <= -0.008123 )
						if( bbp <= -0.457553 )
							ret := -1.000000 // sell
						if( bbp > -0.457553 )
							if( Upper_Band <= 1.0326 )
								if( Lower_Band <= 0.634407 )
									ret := -0.291667
								if( Lower_Band > 0.634407 )
									ret := 0.737952 // buy
							if( Upper_Band > 1.0326 )
								if( bullPower <= -0.033589 )
									ret := 0.600302
								if( bullPower > -0.033589 )
									ret := 0.338539
					if( bullPower > -0.008123 )
						if( Lower_Band <= 0.668041 )
							if( Upper_Band <= 0.623607 )
								ret := 1.000000 // buy
							if( Upper_Band > 0.623607 )
								if( Upper_Band <= 0.654949 )
									ret := 0.000000
								if( Upper_Band > 0.654949 )
									ret := -0.760000 // sell
						if( Lower_Band > 0.668041 )
							if( basis <= 0.701023 )
								if( bbm <= 0.00195 )
									ret := 0.854167 // buy
								if( bbm > 0.00195 )
									ret := 0.272727
							if( basis > 0.701023 )
								if( Upper_Band <= 0.924228 )
									ret := 0.363636
								if( Upper_Band > 0.924228 )
									ret := 0.152955
				if( Upper_Band > 6.68731 )
					if( Upper_Band <= 15.2147 )
						if( bearPower <= -0.025645 )
							if( Upper_Band <= 6.88245 )
								if( bearPower <= -0.124645 )
									ret := -0.823529 // sell
								if( bearPower > -0.124645 )
									ret := 0.000000
							if( Upper_Band > 6.88245 )
								if( Upper_Band <= 6.98934 )
									ret := 0.952381 // buy
								if( Upper_Band > 6.98934 )
									ret := 0.309585
						if( bearPower > -0.025645 )
							if( Lower_Band <= 7.56193 )
								if( bbm <= 0.000401 )
									ret := -0.324324
								if( bbm > 0.000401 )
									ret := -0.846154 // sell
							if( Lower_Band > 7.56193 )
								if( basis <= 14.658 )
									ret := 0.094828
								if( basis > 14.658 )
									ret := 1.000000 // buy
					if( Upper_Band > 15.2147 )
						if( bbp <= -0.364446 )
							if( Upper_Band <= 39.6731 )
								if( basis <= 35.6088 )
									ret := 0.331606
								if( basis > 35.6088 )
									ret := 0.675676
							if( Upper_Band > 39.6731 )
								if( basis <= 43.1989 )
									ret := -0.265306
								if( basis > 43.1989 )
									ret := 0.145679
						if( bbp > -0.364446 )
							if( Upper_Band <= 17.8342 )
								if( basis <= 17.1878 )
									ret := -0.125749
								if( basis > 17.1878 )
									ret := -0.818182 // sell
							if( Upper_Band > 17.8342 )
								if( Lower_Band <= 41.8374 )
									ret := 0.143631
								if( Lower_Band > 41.8374 )
									ret := -0.041783
			if( bbp > -0.009949 )
				if( basis <= 0.613435 )
					if( Lower_Band <= 0.587883 )
						ret := 0.750000 // buy
					if( Lower_Band > 0.587883 )
						ret := 1.000000 // buy
				if( basis > 0.613435 )
					if( bbm <= 0.001171 )
						if( Lower_Band <= 1.45711 )
							if( bearPower <= 0.005388 )
								if( bearPower <= -0.004613 )
									ret := 0.411765
								if( bearPower > -0.004613 )
									ret := -0.030233
							if( bearPower > 0.005388 )
								if( Upper_Band <= 1.18326 )
									ret := -0.357843
								if( Upper_Band > 1.18326 )
									ret := -0.598039
						if( Lower_Band > 1.45711 )
							if( Upper_Band <= 1.9694 )
								if( basis <= 1.81725 )
									ret := 0.196911
								if( basis > 1.81725 )
									ret := 0.661538
							if( Upper_Band > 1.9694 )
								if( Lower_Band <= 3.90886 )
									ret := -0.176600
								if( Lower_Band > 3.90886 )
									ret := 0.103118
					if( bbm > 0.001171 )
						if( basis <= 0.625485 )
							if( bearPower <= -0.004668 )
								ret := -0.500000
							if( bearPower > -0.004668 )
								if( basis <= 0.619275 )
									ret := -0.750000 // sell
								if( basis > 0.619275 )
									ret := -1.000000 // sell
						if( basis > 0.625485 )
							if( bearPower <= 0.00968 )
								if( Lower_Band <= 0.67783 )
									ret := 0.357895
								if( Lower_Band > 0.67783 )
									ret := 0.080742
							if( bearPower > 0.00968 )
								if( Lower_Band <= 1.62685 )
									ret := -0.051282
								if( Lower_Band > 1.62685 )
									ret := -0.642857
		if( bbm > 0.009797 )
			if( basis <= 77.1174 )
				if( bearPower <= -1.92421 )
					if( basis <= 68.004 )
						if( basis <= 23.7688 )
							ret := -0.600000
						if( basis > 23.7688 )
							if( bbp <= -2.581 )
								if( Lower_Band <= 63.6035 )
									ret := 0.610909
								if( Lower_Band > 63.6035 )
									ret := -0.285714
							if( bbp > -2.581 )
								if( Lower_Band <= 56.399 )
									ret := -0.615385
								if( Lower_Band > 56.399 )
									ret := 0.750000 // buy
					if( basis > 68.004 )
						if( Lower_Band <= 68.3845 )
							if( Upper_Band <= 77.3334 )
								if( bearPower <= -2.05376 )
									ret := -0.632353
								if( bearPower > -2.05376 )
									ret := 0.500000
							if( Upper_Band > 77.3334 )
								if( Lower_Band <= 67.7802 )
									ret := 1.000000 // buy
								if( Lower_Band > 67.7802 )
									ret := 0.250000
						if( Lower_Band > 68.3845 )
							if( Upper_Band <= 74.8676 )
								if( basis <= 71.1069 )
									ret := 1.000000 // buy
								if( basis > 71.1069 )
									ret := 0.833333 // buy
							if( Upper_Band > 74.8676 )
								if( basis <= 72.8365 )
									ret := -0.857143 // sell
								if( basis > 72.8365 )
									ret := 0.281250
				if( bearPower > -1.92421 )
					if( Lower_Band <= 1.42039 )
						if( bbp <= -0.03988 )
							if( Lower_Band <= 1.30447 )
								if( basis <= 1.1607 )
									ret := 0.524390
								if( basis > 1.1607 )
									ret := 0.043478
							if( Lower_Band > 1.30447 )
								if( bullPower <= -0.008896 )
									ret := 0.841270 // buy
								if( bullPower > -0.008896 )
									ret := 0.125000
						if( bbp > -0.03988 )
							if( basis <= 1.45622 )
								if( bearPower <= 0.008102 )
									ret := 0.099161
								if( bearPower > 0.008102 )
									ret := 0.404412
							if( basis > 1.45622 )
								if( bullPower <= 0.024981 )
									ret := 0.796610 // buy
								if( bullPower > 0.024981 )
									ret := 0.375000
					if( Lower_Band > 1.42039 )
						if( bbp <= -0.050895 )
							if( Lower_Band <= 3.52049 )
								if( Upper_Band <= 1.73055 )
									ret := 0.568966
								if( Upper_Band > 1.73055 )
									ret := 0.195622
							if( Lower_Band > 3.52049 )
								if( Upper_Band <= 3.94174 )
									ret := -0.281250
								if( Upper_Band > 3.94174 )
									ret := 0.077679
						if( bbp > -0.050895 )
							if( basis <= 1.76379 )
								if( basis <= 1.74416 )
									ret := -0.012450
								if( basis > 1.74416 )
									ret := -0.507353
							if( basis > 1.76379 )
								if( Lower_Band <= 1.79418 )
									ret := 0.220838
								if( Lower_Band > 1.79418 )
									ret := 0.047768
			if( basis > 77.1174 )
				if( bbm <= 0.153083 )
					if( Upper_Band <= 84.4126 )
						if( Upper_Band <= 80.6501 )
							if( bbp <= -0.264524 )
								if( Lower_Band <= 76.8137 )
									ret := 0.000000
								if( Lower_Band > 76.8137 )
									ret := 0.653846
							if( bbp > -0.264524 )
								if( bullPower <= 0.037415 )
									ret := 0.000000
								if( bullPower > 0.037415 )
									ret := -0.250000
						if( Upper_Band > 80.6501 )
							if( bearPower <= -0.202881 )
								if( Lower_Band <= 81.0947 )
									ret := -0.318182
								if( Lower_Band > 81.0947 )
									ret := -0.777778 // sell
							if( bearPower > -0.202881 )
								if( basis <= 81.8947 )
									ret := 0.600000
								if( basis > 81.8947 )
									ret := 0.000000
					if( Upper_Band > 84.4126 )
						if( basis <= 86.0463 )
							if( Upper_Band <= 86.4498 )
								if( basis <= 84.5811 )
									ret := 0.724138 // buy
								if( basis > 84.5811 )
									ret := -0.166667
							if( Upper_Band > 86.4498 )
								if( bbm <= 0.139661 )
									ret := 1.000000 // buy
								if( bbm > 0.139661 )
									ret := 0.750000 // buy
						if( basis > 86.0463 )
							if( bbp <= -1.14204 )
								if( bbm <= 0.101525 )
									ret := 0.363636
								if( bbm > 0.101525 )
									ret := 1.000000 // buy
							if( bbp > -1.14204 )
								if( Upper_Band <= 93.6202 )
									ret := -0.157895
								if( Upper_Band > 93.6202 )
									ret := 1.000000 // buy
				if( bbm > 0.153083 )
					if( bbm <= 2.09128 )
						if( Lower_Band <= 76.8658 )
							if( basis <= 78.4885 )
								if( bearPower <= -2.25618 )
									ret := -0.843750 // sell
								if( bearPower > -2.25618 )
									ret := 0.041667
							if( basis > 78.4885 )
								if( bbm <= 0.438635 )
									ret := -0.076923
								if( bbm > 0.438635 )
									ret := -0.648438
						if( Lower_Band > 76.8658 )
							if( bullPower <= -0.896082 )
								if( basis <= 85.3582 )
									ret := -0.189189
								if( basis > 85.3582 )
									ret := 0.629032
							if( bullPower > -0.896082 )
								if( Lower_Band <= 92.8142 )
									ret := -0.091979
								if( Lower_Band > 92.8142 )
									ret := -0.888889 // sell
					if( bbm > 2.09128 )
						if( Lower_Band <= 87.7121 )
							if( Upper_Band <= 89.4199 )
								if( Lower_Band <= 82.8977 )
									ret := 0.392405
								if( Lower_Band > 82.8977 )
									ret := 0.862069 // buy
							if( Upper_Band > 89.4199 )
								if( bearPower <= -4.45138 )
									ret := 0.842105 // buy
								if( bearPower > -4.45138 )
									ret := -0.191489
						if( Lower_Band > 87.7121 )
							if( Upper_Band <= 98.6262 )
								if( bearPower <= -1.90256 )
									ret := -0.500000
								if( bearPower > -1.90256 )
									ret := -1.000000 // sell
							if( Upper_Band > 98.6262 )
								ret := 0.000000
	if( bearPower > 0.011244 )
		if( bbm <= 0.00944 )
			if( Lower_Band <= 12.2913 )
				if( bullPower <= 0.067808 )
					if( Lower_Band <= 1.65083 )
						if( bbm <= 0.004389 )
							if( bullPower <= 0.025944 )
								if( Upper_Band <= 1.0437 )
									ret := -0.680556
								if( Upper_Band > 1.0437 )
									ret := -0.355372
							if( bullPower > 0.025944 )
								if( Lower_Band <= 1.33875 )
									ret := -0.650000
								if( Lower_Band > 1.33875 )
									ret := -0.927711 // sell
						if( bbm > 0.004389 )
							if( bbp <= 0.046376 )
								if( bbm <= 0.007562 )
									ret := -0.065574
								if( bbm > 0.007562 )
									ret := 0.448276
							if( bbp > 0.046376 )
								if( Upper_Band <= 0.977778 )
									ret := -0.944444 // sell
								if( Upper_Band > 0.977778 )
									ret := -0.362069
					if( Lower_Band > 1.65083 )
						if( bearPower <= 0.039391 )
							if( basis <= 2.23137 )
								if( bbm <= 4.6e-05 )
									ret := -0.070922
								if( bbm > 4.6e-05 )
									ret := 0.275168
							if( basis > 2.23137 )
								if( Upper_Band <= 3.27219 )
									ret := -0.365789
								if( Upper_Band > 3.27219 )
									ret := -0.020619
						if( bearPower > 0.039391 )
							if( Upper_Band <= 4.15212 )
								if( bbp <= 0.086869 )
									ret := -0.446429
								if( bbp > 0.086869 )
									ret := -0.732283 // sell
							if( Upper_Band > 4.15212 )
								if( basis <= 5.05187 )
									ret := 0.206897
								if( basis > 5.05187 )
									ret := -0.220049
				if( bullPower > 0.067808 )
					if( basis <= 3.73714 )
						if( basis <= 1.12827 )
							ret := -0.500000
						if( basis > 1.12827 )
							if( bbp <= 0.202187 )
								if( bearPower <= 0.08991 )
									ret := -0.897436 // sell
								if( bearPower > 0.08991 )
									ret := -0.400000
							if( bbp > 0.202187 )
								ret := -1.000000 // sell
					if( basis > 3.73714 )
						if( Upper_Band <= 4.008 )
							ret := 1.000000 // buy
						if( Upper_Band > 4.008 )
							if( bullPower <= 0.105386 )
								if( bbm <= 0.000425 )
									ret := -0.439863
								if( bbm > 0.000425 )
									ret := -0.654762
							if( bullPower > 0.105386 )
								if( bbm <= 0.00095 )
									ret := -0.612360
								if( bbm > 0.00095 )
									ret := -1.000000 // sell
			if( Lower_Band > 12.2913 )
				if( bearPower <= 0.191096 )
					if( Lower_Band <= 15.5034 )
						if( Lower_Band <= 14.475 )
							if( Upper_Band <= 14.2375 )
								if( bullPower <= 0.132984 )
									ret := 0.088235
								if( bullPower > 0.132984 )
									ret := 0.600000
							if( Upper_Band > 14.2375 )
								if( Upper_Band <= 14.4254 )
									ret := -0.818182 // sell
								if( Upper_Band > 14.4254 )
									ret := -0.064516
						if( Lower_Band > 14.475 )
							if( bullPower <= 0.138123 )
								if( bbm <= 1.1e-05 )
									ret := 0.653846
								if( bbm > 1.1e-05 )
									ret := 1.000000 // buy
							if( bullPower > 0.138123 )
								if( bbp <= 0.314891 )
									ret := 0.000000
								if( bbp > 0.314891 )
									ret := -0.333333
					if( Lower_Band > 15.5034 )
						if( basis <= 21.6701 )
							if( bbm <= 0.005902 )
								if( bullPower <= 0.049338 )
									ret := 0.016129
								if( bullPower > 0.049338 )
									ret := -0.254144
							if( bbm > 0.005902 )
								if( Upper_Band <= 18.2263 )
									ret := -0.600000
								if( Upper_Band > 18.2263 )
									ret := -1.000000 // sell
						if( basis > 21.6701 )
							if( Upper_Band <= 33.1449 )
								if( Lower_Band <= 29.986 )
									ret := 0.253333
								if( Lower_Band > 29.986 )
									ret := 0.687500
							if( Upper_Band > 33.1449 )
								if( Lower_Band <= 62.7945 )
									ret := -0.019048
								if( Lower_Band > 62.7945 )
									ret := 0.125749
				if( bearPower > 0.191096 )
					if( Lower_Band <= 41.5445 )
						if( bbp <= 0.505335 )
							if( Lower_Band <= 14.7564 )
								if( basis <= 14.5503 )
									ret := 0.166667
								if( basis > 14.5503 )
									ret := 0.750000 // buy
							if( Lower_Band > 14.7564 )
								if( bullPower <= 0.198493 )
									ret := -0.500000
								if( bullPower > 0.198493 )
									ret := -0.085366
						if( bbp > 0.505335 )
							if( Upper_Band <= 29.0288 )
								if( bbm <= 0.001306 )
									ret := -0.532110
								if( bbm > 0.001306 )
									ret := -1.000000 // sell
							if( Upper_Band > 29.0288 )
								if( Lower_Band <= 34.4711 )
									ret := -0.089286
								if( Lower_Band > 34.4711 )
									ret := -0.403226
					if( Lower_Band > 41.5445 )
						if( Lower_Band <= 42.4632 )
							if( basis <= 42.8589 )
								if( bbp <= 0.516506 )
									ret := 0.000000
								if( bbp > 0.516506 )
									ret := -0.250000
							if( basis > 42.8589 )
								ret := 1.000000 // buy
						if( Lower_Band > 42.4632 )
							if( Upper_Band <= 95.5817 )
								if( basis <= 86.1015 )
									ret := -0.040685
								if( basis > 86.1015 )
									ret := -0.275862
							if( Upper_Band > 95.5817 )
								ret := 0.750000 // buy
		if( bbm > 0.00944 )
			if( basis <= 85.0627 )
				if( bullPower <= 0.037713 )
					if( Lower_Band <= 0.663718 )
						if( bearPower <= 0.015716 )
							ret := -0.750000 // sell
						if( bearPower > 0.015716 )
							ret := -1.000000 // sell
					if( Lower_Band > 0.663718 )
						if( bbm <= 0.010226 )
							if( Upper_Band <= 2.11382 )
								if( Upper_Band <= 2.02179 )
									ret := 0.058201
								if( Upper_Band > 2.02179 )
									ret := 0.600000
							if( Upper_Band > 2.11382 )
								if( bbm <= 0.00957 )
									ret := 1.000000 // buy
								if( bbm > 0.00957 )
									ret := -0.098446
						if( bbm > 0.010226 )
							if( Upper_Band <= 1.51273 )
								if( basis <= 1.43241 )
									ret := 0.119403
								if( basis > 1.43241 )
									ret := -0.727273 // sell
							if( Upper_Band > 1.51273 )
								if( Lower_Band <= 2.02938 )
									ret := 0.415842
								if( Lower_Band > 2.02938 )
									ret := 0.129693
				if( bullPower > 0.037713 )
					if( Upper_Band <= 2.08061 )
						if( Upper_Band <= 2.03645 )
							if( Lower_Band <= 1.49056 )
								if( bbp <= 0.055369 )
									ret := 0.600000
								if( bbp > 0.055369 )
									ret := -0.493088
							if( Lower_Band > 1.49056 )
								if( bearPower <= 0.02231 )
									ret := 0.148649
								if( bearPower > 0.02231 )
									ret := -0.269784
						if( Upper_Band > 2.03645 )
							if( bearPower <= 0.014446 )
								ret := 0.000000
							if( bearPower > 0.014446 )
								if( Upper_Band <= 2.06872 )
									ret := -0.843137 // sell
								if( Upper_Band > 2.06872 )
									ret := -0.428571
					if( Upper_Band > 2.08061 )
						if( bbm <= 0.019997 )
							if( bearPower <= 0.058122 )
								if( Upper_Band <= 2.143 )
									ret := 1.000000 // buy
								if( Upper_Band > 2.143 )
									ret := -0.018223
							if( bearPower > 0.058122 )
								if( Upper_Band <= 12.8766 )
									ret := -0.509346
								if( Upper_Band > 12.8766 )
									ret := -0.092814
						if( bbm > 0.019997 )
							if( bbp <= 0.086781 )
								if( basis <= 5.46472 )
									ret := 0.220421
								if( basis > 5.46472 )
									ret := -0.035573
							if( bbp > 0.086781 )
								if( bullPower <= 1.20195 )
									ret := -0.023600
								if( bullPower > 1.20195 )
									ret := 0.091380
			if( basis > 85.0627 )
				if( bullPower <= 0.843847 )
					if( basis <= 86.423 )
						if( bearPower <= 0.301538 )
							if( bbm <= 0.584261 )
								if( Upper_Band <= 86.6243 )
									ret := -0.250000
								if( Upper_Band > 86.6243 )
									ret := 0.000000
							if( bbm > 0.584261 )
								ret := -0.571429
						if( bearPower > 0.301538 )
							if( Lower_Band <= 84.2555 )
								ret := 0.000000
							if( Lower_Band > 84.2555 )
								if( bbm <= 0.277981 )
									ret := -1.000000 // sell
								if( bbm > 0.277981 )
									ret := -0.500000
					if( basis > 86.423 )
						if( bearPower <= 0.482964 )
							if( bullPower <= 0.691154 )
								if( bbm <= 0.302517 )
									ret := -0.111111
								if( bbm > 0.302517 )
									ret := 0.290323
							if( bullPower > 0.691154 )
								if( Lower_Band <= 85.193 )
									ret := 0.166667
								if( Lower_Band > 85.193 )
									ret := -0.631579
						if( bearPower > 0.482964 )
							if( bearPower <= 0.583132 )
								ret := 0.800000 // buy
							if( bearPower > 0.583132 )
								if( bbp <= 1.46892 )
									ret := 0.000000
								if( bbp > 1.46892 )
									ret := 0.750000 // buy
				if( bullPower > 0.843847 )
					if( Upper_Band <= 90.1111 )
						if( bbp <= 1.27677 )
							if( Upper_Band <= 87.6553 )
								if( bullPower <= 0.915208 )
									ret := -0.750000 // sell
								if( bullPower > 0.915208 )
									ret := -1.000000 // sell
							if( Upper_Band > 87.6553 )
								ret := -0.250000
						if( bbp > 1.27677 )
							if( bearPower <= 0.306799 )
								if( Upper_Band <= 87.8211 )
									ret := 1.000000 // buy
								if( Upper_Band > 87.8211 )
									ret := 0.000000
							if( bearPower > 0.306799 )
								if( Upper_Band <= 89.1367 )
									ret := -0.352941
								if( Upper_Band > 89.1367 )
									ret := 0.000000
					if( Upper_Band > 90.1111 )
						if( Lower_Band <= 84.0741 )
							if( Upper_Band <= 92.2307 )
								if( Lower_Band <= 80.9923 )
									ret := -1.000000 // sell
								if( Lower_Band > 80.9923 )
									ret := -0.810811 // sell
							if( Upper_Band > 92.2307 )
								ret := -0.400000
						if( Lower_Band > 84.0741 )
							if( Lower_Band <= 86.0924 )
								if( bbp <= 2.27079 )
									ret := -0.454545
								if( bbp > 2.27079 )
									ret := 0.387097
							if( Lower_Band > 86.0924 )
								if( bbm <= 2.43205 )
									ret := -0.788462 // sell
								if( bbm > 2.43205 )
									ret := -0.250000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bollinger_Bands 
//@version=5
//indicator shorttitle="BB", title="Bollinger Bands", overlay=true, timeframe="", timeframe_gaps=true)
length_BB = input.int(20, minval=1)
maType = input.string("SMA", "Basis MA Type", options = ["SMA", "EMA", "SMMA (RMA)", "WMA", "VWMA"])
src = input(close, title="Source")
mult = input.float(2.0, minval=0.001, maxval=50, title="StdDev")

ma(source, length_BB, _type) =>
    switch _type
        "SMA" => ta.sma(source, length_BB)
        "EMA" => ta.ema(source, length_BB)
        "SMMA (RMA)" => ta.rma(source, length_BB)
        "WMA" => ta.wma(source, length_BB)
        "VWMA" => ta.vwma(source, length_BB)

basis = ma(src, length_BB, maType)
dev = mult * ta.stdev(src, length_BB)
Upper_Band = basis + dev
Lower_Band = basis - dev
offset = input.int(0, "Offset", minval = -500, maxval = 500, display = display.data_window)
plot(basis, "Basis", color=#2962FF, offset = offset)
p1 = plot(Upper_Band, "Upper", color=#F23645, offset = offset)
p2 = plot(Lower_Band, "Lower", color=#089981, offset = offset)
fill(p1, p2, title = "Background", color=color.rgb(33, 150, 243, 95))

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
float op_operation = decision_tree_0_APPS_15Min_e2ad2be5(Upper_Band, basis, Lower_Band, bullPower, bbp, bearPower, bbm, BBPower_Color)

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


