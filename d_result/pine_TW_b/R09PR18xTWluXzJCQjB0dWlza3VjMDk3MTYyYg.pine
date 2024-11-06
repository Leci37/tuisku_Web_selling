//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: GOOG_1Min_2BB0_c097162b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GOOG_1Min_2BB0_c097162b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GOOG_1Min_c097162b(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bearPower <= -0.058551 )
		if( bullPower <= -0.102454 )
			if( bbm <= 0.185601 )
				if( bullPower <= -0.229431 )
					if( Upper_Band <= 158.217 )
						if( basis <= 150.344 )
							if( basis <= 149.857 )
								ret := 0.250000
							if( basis > 149.857 )
								if( bullPower <= -0.296126 )
									ret := 1.000000 // buy
								if( bullPower > -0.296126 )
									ret := 0.600000
						if( basis > 150.344 )
							if( Lower_Band <= 152.034 )
								if( Upper_Band <= 152.26 )
									ret := -0.375000
								if( Upper_Band > 152.26 )
									ret := -1.000000 // sell
							if( Lower_Band > 152.034 )
								if( Lower_Band <= 152.727 )
									ret := 0.882353 // buy
								if( Lower_Band > 152.727 )
									ret := -0.122137
					if( Upper_Band > 158.217 )
						if( Upper_Band <= 160.216 )
							if( Upper_Band <= 159.271 )
								if( basis <= 158.139 )
									ret := 0.882353 // buy
								if( basis > 158.139 )
									ret := -0.178571
							if( Upper_Band > 159.271 )
								if( basis <= 159.732 )
									ret := 0.948276 // buy
								if( basis > 159.732 )
									ret := 0.400000
						if( Upper_Band > 160.216 )
							if( Upper_Band <= 161.822 )
								if( Lower_Band <= 159.639 )
									ret := 0.129032
								if( Lower_Band > 159.639 )
									ret := -0.600000
							if( Upper_Band > 161.822 )
								if( Upper_Band <= 165.814 )
									ret := 0.487500
								if( Upper_Band > 165.814 )
									ret := 0.250986
				if( bullPower > -0.229431 )
					if( basis <= 177.733 )
						if( basis <= 175.925 )
							if( Lower_Band <= 164.724 )
								if( Lower_Band <= 163.517 )
									ret := 0.110194
								if( Lower_Band > 163.517 )
									ret := 0.454802
							if( Lower_Band > 164.724 )
								if( basis <= 165.08 )
									ret := -0.630435
								if( basis > 165.08 )
									ret := 0.100226
						if( basis > 175.925 )
							if( Upper_Band <= 178.152 )
								if( basis <= 176.074 )
									ret := -0.606061
								if( basis > 176.074 )
									ret := -0.087179
							if( Upper_Band > 178.152 )
								if( bbm <= 0.123206 )
									ret := 0.571429
								if( bbm > 0.123206 )
									ret := -0.250000
					if( basis > 177.733 )
						if( Upper_Band <= 187.895 )
							if( basis <= 186.886 )
								if( Upper_Band <= 178.243 )
									ret := 0.629032
								if( Upper_Band > 178.243 )
									ret := 0.187623
							if( basis > 186.886 )
								if( Lower_Band <= 186.66 )
									ret := 0.909091 // buy
								if( Lower_Band > 186.66 )
									ret := 0.414634
						if( Upper_Band > 187.895 )
							if( Upper_Band <= 187.992 )
								if( bearPower <= -0.227931 )
									ret := -0.680000
								if( bearPower > -0.227931 )
									ret := -0.166667
							if( Upper_Band > 187.992 )
								if( Lower_Band <= 187.365 )
									ret := 0.545455
								if( Lower_Band > 187.365 )
									ret := 0.033210
			if( bbm > 0.185601 )
				if( basis <= 153.771 )
					if( Upper_Band <= 150.718 )
						if( bullPower <= -0.211379 )
							ret := 1.000000 // buy
						if( bullPower > -0.211379 )
							if( Lower_Band <= 149.327 )
								if( basis <= 149.71 )
									ret := 0.500000
								if( basis > 149.71 )
									ret := -1.000000 // sell
							if( Lower_Band > 149.327 )
								ret := 0.750000 // buy
					if( Upper_Band > 150.718 )
						if( Upper_Band <= 152.208 )
							if( Upper_Band <= 151.403 )
								if( Upper_Band <= 151.16 )
									ret := -0.666667
								if( Upper_Band > 151.16 )
									ret := -1.000000 // sell
							if( Upper_Band > 151.403 )
								if( bbm <= 0.200099 )
									ret := -0.600000
								if( bbm > 0.200099 )
									ret := 0.571429
						if( Upper_Band > 152.208 )
							if( Lower_Band <= 152.528 )
								if( Lower_Band <= 150.695 )
									ret := -0.600000
								if( Lower_Band > 150.695 )
									ret := -0.969697 // sell
							if( Lower_Band > 152.528 )
								ret := -0.250000
				if( basis > 153.771 )
					if( Upper_Band <= 161.59 )
						if( Upper_Band <= 160.518 )
							if( basis <= 158.717 )
								if( Upper_Band <= 156.701 )
									ret := 0.141304
								if( Upper_Band > 156.701 )
									ret := 0.528455
							if( basis > 158.717 )
								if( Lower_Band <= 158.649 )
									ret := -0.888889 // sell
								if( Lower_Band > 158.649 )
									ret := 0.232558
						if( Upper_Band > 160.518 )
							if( basis <= 159.776 )
								ret := 1.000000 // buy
							if( basis > 159.776 )
								if( basis <= 160.326 )
									ret := 0.230769
								if( basis > 160.326 )
									ret := 0.864865 // buy
					if( Upper_Band > 161.59 )
						if( bearPower <= -0.74135 )
							if( basis <= 174.605 )
								if( bullPower <= -0.553553 )
									ret := 0.004762
								if( bullPower > -0.553553 )
									ret := -0.421818
							if( basis > 174.605 )
								if( Upper_Band <= 183.935 )
									ret := 0.682353
								if( Upper_Band > 183.935 )
									ret := -0.394495
						if( bearPower > -0.74135 )
							if( Upper_Band <= 170.429 )
								if( Upper_Band <= 168.959 )
									ret := 0.070574
								if( Upper_Band > 168.959 )
									ret := 0.478528
							if( Upper_Band > 170.429 )
								if( basis <= 170.751 )
									ret := -0.671875
								if( basis > 170.751 )
									ret := 0.011647
		if( bullPower > -0.102454 )
			if( bbm <= 0.049485 )
				if( bbp <= -0.139322 )
					if( basis <= 187.585 )
						if( bbm <= 0.047871 )
							if( basis <= 186.805 )
								if( Lower_Band <= 186.425 )
									ret := 0.189093
								if( Lower_Band > 186.425 )
									ret := -0.750000 // sell
							if( basis > 186.805 )
								if( Upper_Band <= 187.804 )
									ret := 0.500000
								if( Upper_Band > 187.804 )
									ret := 1.000000 // buy
						if( bbm > 0.047871 )
							if( Lower_Band <= 169.818 )
								if( basis <= 165.612 )
									ret := 0.833333 // buy
								if( basis > 165.612 )
									ret := -0.200000
							if( Lower_Band > 169.818 )
								ret := 1.000000 // buy
					if( basis > 187.585 )
						if( bbp <= -0.186906 )
							if( basis <= 187.93 )
								ret := -1.000000 // sell
							if( basis > 187.93 )
								if( bullPower <= -0.097029 )
									ret := 0.250000
								if( bullPower > -0.097029 )
									ret := -0.421053
						if( bbp > -0.186906 )
							if( Upper_Band <= 192.075 )
								if( basis <= 188.445 )
									ret := -0.200000
								if( basis > 188.445 )
									ret := 0.454545
							if( Upper_Band > 192.075 )
								if( bbp <= -0.157236 )
									ret := -0.750000 // sell
								if( bbp > -0.157236 )
									ret := 0.200000
				if( bbp > -0.139322 )
					if( Lower_Band <= 168.083 )
						if( bbm <= 0.040393 )
							if( bearPower <= -0.070056 )
								if( Lower_Band <= 158.287 )
									ret := -0.344828
								if( Lower_Band > 158.287 )
									ret := 0.056911
							if( bearPower > -0.070056 )
								if( bbm <= 0.004484 )
									ret := 0.069930
								if( bbm > 0.004484 )
									ret := 0.257143
						if( bbm > 0.040393 )
							if( bbm <= 0.043736 )
								if( bearPower <= -0.087668 )
									ret := 0.000000
								if( bearPower > -0.087668 )
									ret := 0.913043 // buy
							if( bbm > 0.043736 )
								if( Lower_Band <= 165.586 )
									ret := 0.135593
								if( Lower_Band > 165.586 )
									ret := 0.619048
					if( Lower_Band > 168.083 )
						if( bullPower <= -0.023153 )
							if( Upper_Band <= 168.667 )
								if( Lower_Band <= 168.262 )
									ret := -0.250000
								if( Lower_Band > 168.262 )
									ret := -1.000000 // sell
							if( Upper_Band > 168.667 )
								if( bbm <= 0.037365 )
									ret := 0.009804
								if( bbm > 0.037365 )
									ret := -0.154930
						if( bullPower > -0.023153 )
							if( basis <= 175.149 )
								if( bullPower <= -0.018887 )
									ret := 0.142857
								if( bullPower > -0.018887 )
									ret := -0.500000
							if( basis > 175.149 )
								if( bearPower <= -0.064146 )
									ret := 0.875000 // buy
								if( bearPower > -0.064146 )
									ret := 0.375000
			if( bbm > 0.049485 )
				if( bearPower <= -0.260985 )
					if( Upper_Band <= 158.551 )
						if( bbp <= -0.40118 )
							if( bullPower <= -0.099962 )
								ret := -1.000000 // sell
							if( bullPower > -0.099962 )
								if( bbp <= -0.631234 )
									ret := 0.933333 // buy
								if( bbp > -0.631234 )
									ret := 0.297619
						if( bbp > -0.40118 )
							if( bbm <= 0.278735 )
								if( bullPower <= -0.082994 )
									ret := -0.500000
								if( bullPower > -0.082994 )
									ret := 0.274194
							if( bbm > 0.278735 )
								if( basis <= 156.393 )
									ret := -0.208955
								if( basis > 156.393 )
									ret := -0.689655
					if( Upper_Band > 158.551 )
						if( Upper_Band <= 161.478 )
							if( Upper_Band <= 160.921 )
								if( basis <= 159.377 )
									ret := 0.450000
								if( basis > 159.377 )
									ret := -0.238095
							if( Upper_Band > 160.921 )
								if( Upper_Band <= 161.354 )
									ret := 0.803279 // buy
								if( Upper_Band > 161.354 )
									ret := 1.000000 // buy
						if( Upper_Band > 161.478 )
							if( Upper_Band <= 162.921 )
								if( Upper_Band <= 162.846 )
									ret := -0.040650
								if( Upper_Band > 162.846 )
									ret := -0.862069 // sell
							if( Upper_Band > 162.921 )
								if( Lower_Band <= 162.69 )
									ret := 0.594828
								if( Lower_Band > 162.69 )
									ret := 0.122887
				if( bearPower > -0.260985 )
					if( bbm <= 0.120636 )
						if( basis <= 187.548 )
							if( Upper_Band <= 187.506 )
								if( Upper_Band <= 149.085 )
									ret := 1.000000 // buy
								if( Upper_Band > 149.085 )
									ret := 0.020000
							if( Upper_Band > 187.506 )
								if( bbp <= -0.0704 )
									ret := 0.645833
								if( bbp > -0.0704 )
									ret := -0.428571
						if( basis > 187.548 )
							if( basis <= 188.917 )
								if( bearPower <= -0.172735 )
									ret := 0.411765
								if( bearPower > -0.172735 )
									ret := -0.467949
							if( basis > 188.917 )
								if( Upper_Band <= 190.775 )
									ret := 0.392157
								if( Upper_Band > 190.775 )
									ret := -0.071651
					if( bbm > 0.120636 )
						if( basis <= 170.186 )
							if( basis <= 168.265 )
								if( bullPower <= 0.046272 )
									ret := -0.000988
								if( bullPower > 0.046272 )
									ret := 0.149435
							if( basis > 168.265 )
								if( bullPower <= 0.044269 )
									ret := -0.077170
								if( bullPower > 0.044269 )
									ret := -0.284345
						if( basis > 170.186 )
							if( basis <= 173.705 )
								if( Lower_Band <= 173.101 )
									ret := 0.164845
								if( Lower_Band > 173.101 )
									ret := 0.650350
							if( basis > 173.705 )
								if( Lower_Band <= 173.816 )
									ret := -0.233766
								if( Lower_Band > 173.816 )
									ret := 0.100161
	if( bearPower > -0.058551 )
		if( bearPower <= 0.214099 )
			if( Upper_Band <= 149.873 )
				if( bbm <= 0.044172 )
					if( bullPower <= -0.011821 )
						ret := 1.000000 // buy
					if( bullPower > -0.011821 )
						if( basis <= 149.31 )
							ret := -0.857143 // sell
						if( basis > 149.31 )
							if( Upper_Band <= 149.804 )
								if( bullPower <= 0.070171 )
									ret := 0.722222 // buy
								if( bullPower > 0.070171 )
									ret := 0.250000
							if( Upper_Band > 149.804 )
								if( bbm <= 0.022413 )
									ret := -0.040000
								if( bbm > 0.022413 )
									ret := 0.400000
				if( bbm > 0.044172 )
					if( basis <= 149.446 )
						if( Lower_Band <= 148.615 )
							if( bbm <= 0.207877 )
								ret := 1.000000 // buy
							if( bbm > 0.207877 )
								ret := 0.500000
						if( Lower_Band > 148.615 )
							if( bearPower <= 0.071391 )
								if( bullPower <= 0.13555 )
									ret := 0.571429
								if( bullPower > 0.13555 )
									ret := 1.000000 // buy
							if( bearPower > 0.071391 )
								if( bullPower <= 0.293107 )
									ret := 0.333333
								if( bullPower > 0.293107 )
									ret := 0.000000
					if( basis > 149.446 )
						if( bullPower <= 0.05401 )
							ret := 0.750000 // buy
						if( bullPower > 0.05401 )
							ret := 1.000000 // buy
			if( Upper_Band > 149.873 )
				if( basis <= 157.859 )
					if( basis <= 156.735 )
						if( basis <= 156.472 )
							if( Lower_Band <= 155.356 )
								if( Lower_Band <= 155.004 )
									ret := 0.075362
								if( Lower_Band > 155.004 )
									ret := -0.372093
							if( Lower_Band > 155.356 )
								if( basis <= 156.352 )
									ret := 0.355795
								if( basis > 156.352 )
									ret := -0.134615
						if( basis > 156.472 )
							if( basis <= 156.522 )
								if( bbm <= 0.00143 )
									ret := -0.181818
								if( bbm > 0.00143 )
									ret := -0.793651 // sell
							if( basis > 156.522 )
								if( Upper_Band <= 157.076 )
									ret := 0.146341
								if( Upper_Band > 157.076 )
									ret := -0.767442 // sell
					if( basis > 156.735 )
						if( basis <= 156.988 )
							if( bullPower <= 0.059719 )
								if( bullPower <= -0.010029 )
									ret := 0.333333
								if( bullPower > -0.010029 )
									ret := -0.227273
							if( bullPower > 0.059719 )
								if( Lower_Band <= 156.716 )
									ret := 0.683673
								if( Lower_Band > 156.716 )
									ret := -0.666667
						if( basis > 156.988 )
							if( Lower_Band <= 156.911 )
								if( bearPower <= 0.15917 )
									ret := -0.373134
								if( bearPower > 0.15917 )
									ret := 0.250000
							if( Lower_Band > 156.911 )
								if( Lower_Band <= 156.971 )
									ret := 0.969697 // buy
								if( Lower_Band > 156.971 )
									ret := 0.214429
				if( basis > 157.859 )
					if( bbm <= 0.000144 )
						if( basis <= 157.985 )
							if( bullPower <= 0.020656 )
								ret := 0.000000
							if( bullPower > 0.020656 )
								if( bearPower <= 0.076762 )
									ret := 1.000000 // buy
								if( bearPower > 0.076762 )
									ret := 0.500000
						if( basis > 157.985 )
							if( Lower_Band <= 159.857 )
								if( Lower_Band <= 157.835 )
									ret := 0.162791
								if( Lower_Band > 157.835 )
									ret := -0.280822
							if( Lower_Band > 159.857 )
								if( basis <= 161.535 )
									ret := 0.317204
								if( basis > 161.535 )
									ret := -0.032548
					if( bbm > 0.000144 )
						if( Upper_Band <= 158.266 )
							if( bullPower <= -0.003616 )
								ret := 0.857143 // buy
							if( bullPower > -0.003616 )
								if( Upper_Band <= 158.232 )
									ret := -0.219697
								if( Upper_Band > 158.232 )
									ret := -0.617021
						if( Upper_Band > 158.266 )
							if( bullPower <= 0.216576 )
								if( Upper_Band <= 187.442 )
									ret := 0.046518
								if( Upper_Band > 187.442 )
									ret := -0.056026
							if( bullPower > 0.216576 )
								if( basis <= 166.355 )
									ret := 0.089216
								if( basis > 166.355 )
									ret := -0.066057
		if( bearPower > 0.214099 )
			if( Lower_Band <= 174.711 )
				if( Lower_Band <= 164.597 )
					if( Lower_Band <= 163.193 )
						if( Lower_Band <= 160.054 )
							if( bullPower <= 0.845354 )
								if( basis <= 159.788 )
									ret := -0.143599
								if( basis > 159.788 )
									ret := -0.638095
							if( bullPower > 0.845354 )
								if( basis <= 163.527 )
									ret := 0.369427
								if( basis > 163.527 )
									ret := -0.857143 // sell
						if( Lower_Band > 160.054 )
							if( Lower_Band <= 160.36 )
								if( bearPower <= 0.3389 )
									ret := 0.930233 // buy
								if( bearPower > 0.3389 )
									ret := 0.130435
							if( Lower_Band > 160.36 )
								if( Upper_Band <= 163.773 )
									ret := -0.067138
								if( Upper_Band > 163.773 )
									ret := 0.294872
					if( Lower_Band > 163.193 )
						if( bbm <= 0.2175 )
							if( Upper_Band <= 164.837 )
								if( basis <= 164.116 )
									ret := -0.386364
								if( basis > 164.116 )
									ret := -0.775510 // sell
							if( Upper_Band > 164.837 )
								if( bearPower <= 0.356282 )
									ret := -0.051546
								if( bearPower > 0.356282 )
									ret := -0.666667
						if( bbm > 0.2175 )
							if( bbp <= 1.0938 )
								if( bbp <= 0.874089 )
									ret := -0.818182 // sell
								if( bbp > 0.874089 )
									ret := 0.000000
							if( bbp > 1.0938 )
								ret := -1.000000 // sell
				if( Lower_Band > 164.597 )
					if( bbm <= 0.250098 )
						if( bbm <= 0.119506 )
							if( basis <= 165.861 )
								if( Lower_Band <= 165.057 )
									ret := 0.354167
								if( Lower_Band > 165.057 )
									ret := 1.000000 // buy
							if( basis > 165.861 )
								if( Upper_Band <= 167.353 )
									ret := -0.466667
								if( Upper_Band > 167.353 )
									ret := 0.094340
						if( bbm > 0.119506 )
							if( Lower_Band <= 165.608 )
								if( bbp <= 1.05738 )
									ret := 0.467742
								if( bbp > 1.05738 )
									ret := -0.833333 // sell
							if( Lower_Band > 165.608 )
								if( bullPower <= 0.353265 )
									ret := 0.800000 // buy
								if( bullPower > 0.353265 )
									ret := -0.356495
					if( bbm > 0.250098 )
						if( Lower_Band <= 166.11 )
							if( basis <= 166.399 )
								if( bullPower <= 0.784907 )
									ret := 0.857143 // buy
								if( bullPower > 0.784907 )
									ret := -1.000000 // sell
							if( basis > 166.399 )
								if( bearPower <= 0.408241 )
									ret := -0.892857 // sell
								if( bearPower > 0.408241 )
									ret := 0.285714
						if( Lower_Band > 166.11 )
							if( bbp <= 1.13858 )
								if( Lower_Band <= 174.021 )
									ret := 0.588235
								if( Lower_Band > 174.021 )
									ret := -1.000000 // sell
							if( bbp > 1.13858 )
								if( bullPower <= 1.06958 )
									ret := -0.191011
								if( bullPower > 1.06958 )
									ret := 0.523810
			if( Lower_Band > 174.711 )
				if( Lower_Band <= 186.802 )
					if( basis <= 186.781 )
						if( bbp <= 1.77588 )
							if( Lower_Band <= 184.352 )
								if( Lower_Band <= 183.852 )
									ret := -0.277419
								if( Lower_Band > 183.852 )
									ret := -0.843750 // sell
							if( Lower_Band > 184.352 )
								if( Lower_Band <= 185.356 )
									ret := 0.428571
								if( Lower_Band > 185.356 )
									ret := -0.333333
						if( bbp > 1.77588 )
							if( bearPower <= 0.61721 )
								if( Upper_Band <= 181.005 )
									ret := -1.000000 // sell
								if( Upper_Band > 181.005 )
									ret := -0.250000
							if( bearPower > 0.61721 )
								if( bbp <= 2.59573 )
									ret := -1.000000 // sell
								if( bbp > 2.59573 )
									ret := -0.800000 // sell
					if( basis > 186.781 )
						if( basis <= 187.488 )
							if( Lower_Band <= 186.364 )
								if( bbm <= 0.4942 )
									ret := -1.000000 // sell
								if( bbm > 0.4942 )
									ret := -0.600000
							if( Lower_Band > 186.364 )
								if( basis <= 187.261 )
									ret := -0.142857
								if( basis > 187.261 )
									ret := -1.000000 // sell
						if( basis > 187.488 )
							ret := -0.250000
				if( Lower_Band > 186.802 )
					if( bearPower <= 0.284587 )
						if( Lower_Band <= 190.559 )
							if( Upper_Band <= 187.727 )
								ret := -1.000000 // sell
							if( Upper_Band > 187.727 )
								if( bearPower <= 0.262455 )
									ret := 0.195652
								if( bearPower > 0.262455 )
									ret := -0.538462
						if( Lower_Band > 190.559 )
							if( bbp <= 0.626797 )
								ret := -1.000000 // sell
							if( bbp > 0.626797 )
								ret := -0.750000 // sell
					if( bearPower > 0.284587 )
						if( bullPower <= 0.368453 )
							ret := -0.500000
						if( bullPower > 0.368453 )
							if( bbp <= 1.70987 )
								if( basis <= 191.244 )
									ret := 0.818182 // buy
								if( basis > 191.244 )
									ret := 0.000000
							if( bbp > 1.70987 )
								ret := -0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_GOOG_1Min_c097162b(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)

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


