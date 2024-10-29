//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Chaikin_Money_Flow
// ID_model: UPST_1Min_2BC0_cac9f532 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Min_2BC0_cac9f532", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Min_cac9f532(bbp, bullPower, BBPower_Color, bearPower, bbm, ad_mf, mf, ad)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( BBPower_Color <= 0.5 )
		if( ad_mf <= 438.648 )
			if( bbm <= 0.002996 )
				if( bbp <= -0.062272 )
					if( bbp <= -0.397678 )
						if( ad_mf <= 0.207936 )
							if( mf <= 0.15783 )
								if( mf <= 0.076671 )
									ret := 0.402174
								if( mf > 0.076671 )
									ret := -0.454545
							if( mf > 0.15783 )
								if( bullPower <= -0.241946 )
									ret := 0.620690
								if( bullPower > -0.241946 )
									ret := 0.916667 // buy
						if( ad_mf > 0.207936 )
							if( mf <= -0.309473 )
								if( bullPower <= -0.316164 )
									ret := -0.500000
								if( bullPower > -0.316164 )
									ret := 0.307692
							if( mf > -0.309473 )
								if( bullPower <= -0.249436 )
									ret := -0.666667
								if( bullPower > -0.249436 )
									ret := -0.947368 // sell
					if( bbp > -0.397678 )
						if( bearPower <= -0.08892 )
							if( mf <= 0.166322 )
								if( bearPower <= -0.169274 )
									ret := 0.692308
								if( bearPower > -0.169274 )
									ret := 0.491551
							if( mf > 0.166322 )
								if( mf <= 0.183612 )
									ret := -0.160000
								if( mf > 0.183612 )
									ret := 0.386905
						if( bearPower > -0.08892 )
							if( ad_mf <= -0.190854 )
								if( ad_mf <= -0.273493 )
									ret := 0.407080
								if( ad_mf > -0.273493 )
									ret := 0.632258
							if( ad_mf > -0.190854 )
								if( mf <= 0.128991 )
									ret := 0.344828
								if( mf > 0.128991 )
									ret := -0.015873
				if( bbp > -0.062272 )
					if( mf <= -0.270224 )
						if( bbp <= -0.046671 )
							if( ad_mf <= 0.413001 )
								if( bullPower <= -0.025081 )
									ret := -0.352941
								if( bullPower > -0.025081 )
									ret := 0.117647
							if( ad_mf > 0.413001 )
								if( bullPower <= -0.028144 )
									ret := 0.571429
								if( bullPower > -0.028144 )
									ret := 0.225806
						if( bbp > -0.046671 )
							if( mf <= -0.530516 )
								if( ad_mf <= 0.613382 )
									ret := -0.677419
								if( ad_mf > 0.613382 )
									ret := 0.000000
							if( mf > -0.530516 )
								if( bullPower <= -0.022087 )
									ret := -0.500000
								if( bullPower > -0.022087 )
									ret := -0.089474
					if( mf > -0.270224 )
						if( bbp <= -0.017112 )
							if( mf <= -0.123544 )
								if( ad_mf <= 0.16906 )
									ret := 0.336283
								if( ad_mf > 0.16906 )
									ret := 0.050314
							if( mf > -0.123544 )
								if( ad_mf <= -0.255335 )
									ret := 0.161290
								if( ad_mf > -0.255335 )
									ret := -0.011070
						if( bbp > -0.017112 )
							if( bearPower <= -0.00212 )
								if( mf <= 0.05912 )
									ret := 0.312500
								if( mf > 0.05912 )
									ret := 0.154839
							if( bearPower > -0.00212 )
								if( bbp <= -0.003442 )
									ret := 0.100000
								if( bbp > -0.003442 )
									ret := -0.056338
			if( bbm > 0.002996 )
				if( bbm <= 0.245238 )
					if( bearPower <= -0.017807 )
						if( ad <= -1897.8 )
							if( bbp <= -0.843752 )
								if( mf <= -0.209882 )
									ret := 0.857143 // buy
								if( mf > -0.209882 )
									ret := 0.230769
							if( bbp > -0.843752 )
								if( bbp <= 0.005551 )
									ret := 0.037281
								if( bbp > 0.005551 )
									ret := 0.152253
						if( ad > -1897.8 )
							if( ad_mf <= -195.832 )
								if( ad <= -334.238 )
									ret := 0.138160
								if( ad > -334.238 )
									ret := 0.450549
							if( ad_mf > -195.832 )
								if( ad <= 19.3281 )
									ret := -0.044866
								if( ad > 19.3281 )
									ret := 0.209302
					if( bearPower > -0.017807 )
						if( bbp <= -0.004109 )
							if( mf <= 0.317986 )
								if( mf <= -0.036523 )
									ret := -0.023364
								if( mf > -0.036523 )
									ret := 0.120773
							if( mf > 0.317986 )
								if( ad_mf <= -0.422554 )
									ret := -0.200000
								if( ad_mf > -0.422554 )
									ret := -0.636364
						if( bbp > -0.004109 )
							if( ad <= -882.436 )
								if( ad_mf <= -2580.38 )
									ret := 0.248848
								if( ad_mf > -2580.38 )
									ret := 0.021583
							if( ad > -882.436 )
								if( ad <= -821.452 )
									ret := 0.900000 // buy
								if( ad > -821.452 )
									ret := 0.373887
				if( bbm > 0.245238 )
					if( bearPower <= -0.647477 )
						if( mf <= -0.239195 )
							if( bbm <= 0.749 )
								if( ad_mf <= -65321 )
									ret := 0.000000
								if( ad_mf > -65321 )
									ret := 0.692308
							if( bbm > 0.749 )
								ret := 1.000000 // buy
						if( mf > -0.239195 )
							if( ad_mf <= -144677 )
								ret := 0.750000 // buy
							if( ad_mf > -144677 )
								if( ad <= -3289.3 )
									ret := 1.000000 // buy
								if( ad > -3289.3 )
									ret := 0.833333 // buy
					if( bearPower > -0.647477 )
						if( ad <= -61068.4 )
							if( ad <= -74372.1 )
								if( bullPower <= 0.042721 )
									ret := 0.135593
								if( bullPower > 0.042721 )
									ret := 0.594828
							if( ad > -74372.1 )
								if( bearPower <= -0.567653 )
									ret := 0.250000
								if( bearPower > -0.567653 )
									ret := 0.902778 // buy
						if( ad > -61068.4 )
							if( ad <= -58835.9 )
								if( bbm <= 0.29064 )
									ret := -0.333333
								if( bbm > 0.29064 )
									ret := -1.000000 // sell
							if( ad > -58835.9 )
								if( bullPower <= 0.657531 )
									ret := 0.293028
								if( bullPower > 0.657531 )
									ret := -1.000000 // sell
		if( ad_mf > 438.648 )
			if( bbm <= 0.500495 )
				if( ad <= 40478.3 )
					if( ad_mf <= 27373.4 )
						if( mf <= -0.081225 )
							if( bullPower <= 0.040954 )
								if( bearPower <= -0.003972 )
									ret := 0.003360
								if( bearPower > -0.003972 )
									ret := 0.534884
							if( bullPower > 0.040954 )
								if( ad <= 3077.43 )
									ret := -0.376106
								if( ad > 3077.43 )
									ret := -0.048837
						if( mf > -0.081225 )
							if( ad <= 592.211 )
								if( ad <= 455.507 )
									ret := -0.600000
								if( ad > 455.507 )
									ret := -0.191710
							if( ad > 592.211 )
								if( ad <= 26557.9 )
									ret := 0.042537
								if( ad > 26557.9 )
									ret := -0.577778
					if( ad_mf > 27373.4 )
						if( bbp <= -0.396537 )
							if( ad <= 31445.6 )
								if( ad <= 28069.4 )
									ret := 1.000000 // buy
								if( ad > 28069.4 )
									ret := 0.653333
							if( ad > 31445.6 )
								if( mf <= -0.27818 )
									ret := -0.700000 // sell
								if( mf > -0.27818 )
									ret := 0.235294
						if( bbp > -0.396537 )
							if( bbm <= 0.26002 )
								if( ad <= 39540 )
									ret := 0.052506
								if( ad > 39540 )
									ret := 0.647059
							if( bbm > 0.26002 )
								if( ad <= 28695.3 )
									ret := 0.920000 // buy
								if( ad > 28695.3 )
									ret := 0.238095
				if( ad > 40478.3 )
					if( bullPower <= -0.066147 )
						if( ad <= 46995 )
							if( bbm <= 0.127 )
								ret := 0.000000
							if( bbm > 0.127 )
								if( ad_mf <= 44046.4 )
									ret := -0.967742 // sell
								if( ad_mf > 44046.4 )
									ret := -0.555556
						if( ad > 46995 )
							if( ad_mf <= 61978.3 )
								if( mf <= 0.018995 )
									ret := 0.434783
								if( mf > 0.018995 )
									ret := -0.555556
							if( ad_mf > 61978.3 )
								if( ad <= 73875.5 )
									ret := -0.827586 // sell
								if( ad > 73875.5 )
									ret := -0.250000
					if( bullPower > -0.066147 )
						if( bbm <= 0.249372 )
							if( ad_mf <= 73807.8 )
								if( bbm <= 0.151538 )
									ret := 0.123894
								if( bbm > 0.151538 )
									ret := -0.254386
							if( ad_mf > 73807.8 )
								if( ad_mf <= 84230.5 )
									ret := -0.866667 // sell
								if( ad_mf > 84230.5 )
									ret := -0.314815
						if( bbm > 0.249372 )
							if( bbp <= 0.077097 )
								if( ad_mf <= 53050.4 )
									ret := 0.000000
								if( ad_mf > 53050.4 )
									ret := 0.428571
							if( bbp > 0.077097 )
								if( ad <= 73857.8 )
									ret := 0.000000
								if( ad > 73857.8 )
									ret := -0.545455
			if( bbm > 0.500495 )
				if( bullPower <= 0.032493 )
					if( ad <= 29163.6 )
						ret := 0.857143 // buy
					if( ad > 29163.6 )
						if( bbm <= 0.565419 )
							ret := 0.250000
						if( bbm > 0.565419 )
							ret := -1.000000 // sell
				if( bullPower > 0.032493 )
					if( bullPower <= 0.553896 )
						if( ad <= 6464.41 )
							if( bearPower <= -0.272895 )
								if( bullPower <= 0.212924 )
									ret := -0.666667
								if( bullPower > 0.212924 )
									ret := 0.857143 // buy
							if( bearPower > -0.272895 )
								ret := -1.000000 // sell
						if( ad > 6464.41 )
							if( ad <= 26897.4 )
								ret := -1.000000 // sell
							if( ad > 26897.4 )
								if( mf <= 0.404449 )
									ret := -0.142857
								if( mf > 0.404449 )
									ret := -0.857143 // sell
					if( bullPower > 0.553896 )
						ret := 0.142857
	if( BBPower_Color > 0.5 )
		if( ad_mf <= -336.629 )
			if( ad_mf <= -67342.2 )
				if( ad_mf <= -73847.3 )
					if( ad_mf <= -114821 )
						if( ad_mf <= -178715 )
							if( ad <= -243966 )
								ret := 1.000000 // buy
							if( ad > -243966 )
								if( bbp <= 0.357148 )
									ret := 0.444444
								if( bbp > 0.357148 )
									ret := -1.000000 // sell
						if( ad_mf > -178715 )
							if( bearPower <= 0.309611 )
								if( bbp <= 0.129951 )
									ret := 0.400000
								if( bbp > 0.129951 )
									ret := 0.956522 // buy
							if( bearPower > 0.309611 )
								if( bullPower <= 1.00794 )
									ret := -0.250000
								if( bullPower > 1.00794 )
									ret := 1.000000 // buy
					if( ad_mf > -114821 )
						if( bullPower <= 0.622766 )
							if( mf <= 0.135693 )
								if( bullPower <= 0.265566 )
									ret := 0.214286
								if( bullPower > 0.265566 )
									ret := -0.655172
							if( mf > 0.135693 )
								if( bbm <= 0.22 )
									ret := -0.800000 // sell
								if( bbm > 0.22 )
									ret := 0.666667
						if( bullPower > 0.622766 )
							if( ad_mf <= -88869 )
								ret := 0.000000
							if( ad_mf > -88869 )
								if( mf <= 0.230476 )
									ret := 1.000000 // buy
								if( mf > 0.230476 )
									ret := 0.750000 // buy
				if( ad_mf > -73847.3 )
					if( bullPower <= 0.258041 )
						ret := 0.500000
					if( bullPower > 0.258041 )
						if( mf <= 0.091709 )
							if( mf <= -0.009768 )
								ret := 1.000000 // buy
							if( mf > -0.009768 )
								ret := 0.500000
						if( mf > 0.091709 )
							ret := 1.000000 // buy
			if( ad_mf > -67342.2 )
				if( ad <= -32242 )
					if( bearPower <= -0.092602 )
						if( ad_mf <= -39843 )
							if( bearPower <= -0.14224 )
								ret := -0.750000 // sell
							if( bearPower > -0.14224 )
								ret := -1.000000 // sell
						if( ad_mf > -39843 )
							ret := -0.200000
					if( bearPower > -0.092602 )
						if( ad_mf <= -48556.4 )
							if( ad <= -55798.6 )
								if( bbp <= 0.291058 )
									ret := -0.571429
								if( bbp > 0.291058 )
									ret := -0.074074
							if( ad > -55798.6 )
								if( bbm <= 0.08195 )
									ret := -0.111111
								if( bbm > 0.08195 )
									ret := 0.645833
						if( ad_mf > -48556.4 )
							if( ad <= -33331.9 )
								if( mf <= 0.175634 )
									ret := -0.267606
								if( mf > 0.175634 )
									ret := 0.142857
							if( ad > -33331.9 )
								if( bbp <= 0.327222 )
									ret := -0.230769
								if( bbp > 0.327222 )
									ret := -0.923077 // sell
				if( ad > -32242 )
					if( bearPower <= -0.116313 )
						if( mf <= 0.154886 )
							if( mf <= -0.057716 )
								if( bearPower <= -0.130442 )
									ret := 0.294118
								if( bearPower > -0.130442 )
									ret := 0.800000 // buy
							if( mf > -0.057716 )
								if( ad_mf <= -12108.6 )
									ret := 0.800000 // buy
								if( ad_mf > -12108.6 )
									ret := 1.000000 // buy
						if( mf > 0.154886 )
							if( ad <= -17434.8 )
								ret := 0.750000 // buy
							if( ad > -17434.8 )
								ret := -0.285714
					if( bearPower > -0.116313 )
						if( bbp <= 0.114834 )
							if( ad_mf <= -30225.3 )
								if( mf <= -0.071806 )
									ret := 0.250000
								if( mf > -0.071806 )
									ret := -1.000000 // sell
							if( ad_mf > -30225.3 )
								if( bullPower <= 0.164051 )
									ret := 0.026152
								if( bullPower > 0.164051 )
									ret := -0.461538
						if( bbp > 0.114834 )
							if( ad_mf <= -26829.1 )
								if( bearPower <= 0.248043 )
									ret := 0.363636
								if( bearPower > 0.248043 )
									ret := -0.666667
							if( ad_mf > -26829.1 )
								if( ad <= -26529.3 )
									ret := -0.520000
								if( ad > -26529.3 )
									ret := 0.072000
		if( ad_mf > -336.629 )
			if( ad <= 1788.57 )
				if( bbp <= 0.122592 )
					if( bearPower <= 0.039019 )
						if( bullPower <= 0.111573 )
							if( ad_mf <= 0.233895 )
								if( bbm <= 0.092786 )
									ret := 0.049573
								if( bbm > 0.092786 )
									ret := 0.500000
							if( ad_mf > 0.233895 )
								if( ad_mf <= 0.312415 )
									ret := -0.238372
								if( ad_mf > 0.312415 )
									ret := 0.007488
						if( bullPower > 0.111573 )
							if( bbm <= 0.34425 )
								if( bbm <= 0.15825 )
									ret := -0.315789
								if( bbm > 0.15825 )
									ret := -0.760000 // sell
							if( bbm > 0.34425 )
								ret := 0.250000
					if( bearPower > 0.039019 )
						if( bbm <= 5e-05 )
							if( ad_mf <= 0.528031 )
								if( ad_mf <= -0.114708 )
									ret := -0.093151
								if( ad_mf > -0.114708 )
									ret := -0.255354
							if( ad_mf > 0.528031 )
								if( bearPower <= 0.055611 )
									ret := 0.629630
								if( bearPower > 0.055611 )
									ret := 0.000000
						if( bbm > 5e-05 )
							if( ad_mf <= 0.005425 )
								if( bearPower <= 0.042387 )
									ret := -0.300000
								if( bearPower > 0.042387 )
									ret := 0.418605
							if( ad_mf > 0.005425 )
								if( mf <= -0.170837 )
									ret := 0.440000
								if( mf > -0.170837 )
									ret := -0.095588
				if( bbp > 0.122592 )
					if( bbm <= 0.000373 )
						if( bullPower <= 0.352052 )
							if( bearPower <= 0.089836 )
								if( bullPower <= 0.065631 )
									ret := -0.448113
								if( bullPower > 0.065631 )
									ret := -0.186235
							if( bearPower > 0.089836 )
								if( mf <= -0.113923 )
									ret := -0.487805
								if( mf > -0.113923 )
									ret := -0.309819
						if( bullPower > 0.352052 )
							if( mf <= -0.065063 )
								ret := -1.000000 // sell
							if( mf > -0.065063 )
								if( bearPower <= 0.441707 )
									ret := -1.000000 // sell
								if( bearPower > 0.441707 )
									ret := -0.700000 // sell
					if( bbm > 0.000373 )
						if( ad <= 258.026 )
							if( ad_mf <= -0.479681 )
								if( bbm <= 0.14015 )
									ret := -0.029126
								if( bbm > 0.14015 )
									ret := -0.818182 // sell
							if( ad_mf > -0.479681 )
								if( bearPower <= 0.189949 )
									ret := 0.051829
								if( bearPower > 0.189949 )
									ret := 0.433333
						if( ad > 258.026 )
							if( bbm <= 0.12995 )
								if( ad <= 1124.33 )
									ret := -0.302000
								if( ad > 1124.33 )
									ret := -0.106952
							if( bbm > 0.12995 )
								if( ad <= 1590.83 )
									ret := -0.639344
								if( ad > 1590.83 )
									ret := -0.111111
			if( ad > 1788.57 )
				if( mf <= 0.500454 )
					if( ad <= 14870 )
						if( bearPower <= -0.046645 )
							if( bullPower <= 0.118755 )
								if( bullPower <= 0.053126 )
									ret := -0.625000
								if( bullPower > 0.053126 )
									ret := -0.048611
							if( bullPower > 0.118755 )
								if( mf <= 0.129121 )
									ret := -0.246575
								if( mf > 0.129121 )
									ret := -0.645833
						if( bearPower > -0.046645 )
							if( ad_mf <= 14493.6 )
								if( bullPower <= 0.15421 )
									ret := 0.004535
								if( bullPower > 0.15421 )
									ret := 0.071640
							if( ad_mf > 14493.6 )
								if( bbp <= 0.385672 )
									ret := -0.464286
								if( bbp > 0.385672 )
									ret := 0.875000 // buy
					if( ad > 14870 )
						if( ad <= 41774.2 )
							if( ad_mf <= 16605 )
								if( ad_mf <= 16554.7 )
									ret := 0.276923
								if( ad_mf > 16554.7 )
									ret := 0.850000 // buy
							if( ad_mf > 16605 )
								if( ad <= 31896.4 )
									ret := 0.072664
								if( ad > 31896.4 )
									ret := 0.263279
						if( ad > 41774.2 )
							if( bbp <= 0.664123 )
								if( mf <= -0.129604 )
									ret := 0.800000 // buy
								if( mf > -0.129604 )
									ret := -0.174098
							if( bbp > 0.664123 )
								if( bearPower <= 0.453427 )
									ret := 0.281915
								if( bearPower > 0.453427 )
									ret := -0.555556
				if( mf > 0.500454 )
					if( bearPower <= 0.183759 )
						if( bearPower <= 0.1508 )
							if( bullPower <= 0.164575 )
								if( ad_mf <= 2893.43 )
									ret := -0.413793
								if( ad_mf > 2893.43 )
									ret := 0.073171
							if( bullPower > 0.164575 )
								if( bullPower <= 0.630135 )
									ret := -0.466667
								if( bullPower > 0.630135 )
									ret := 0.428571
						if( bearPower > 0.1508 )
							if( mf <= 0.597195 )
								if( bbp <= 0.406047 )
									ret := 0.250000
								if( bbp > 0.406047 )
									ret := -0.166667
							if( mf > 0.597195 )
								ret := 0.714286 // buy
					if( bearPower > 0.183759 )
						if( bullPower <= 0.439039 )
							if( bullPower <= 0.289453 )
								if( bearPower <= 0.203788 )
									ret := -1.000000 // sell
								if( bearPower > 0.203788 )
									ret := -0.750000 // sell
							if( bullPower > 0.289453 )
								if( bullPower <= 0.340386 )
									ret := -0.333333
								if( bullPower > 0.340386 )
									ret := 0.000000
						if( bullPower > 0.439039 )
							if( bbm <= 0.21495 )
								ret := -0.750000 // sell
							if( bbm > 0.21495 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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


//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf
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
float op_operation = decision_tree_0_UPST_1Min_cac9f532(bbp, bullPower, BBPower_Color, bearPower, bbm, ad_mf, mf, ad)

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


