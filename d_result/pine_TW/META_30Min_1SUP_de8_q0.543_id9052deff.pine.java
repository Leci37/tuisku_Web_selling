//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: META_30Min_1SUP_9052deff Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_META_30Min_1SUP_9052deff", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_META_30Min_9052deff(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( atr <= 1.83168 )
		if( up <= 221.143 )
			if( dn1 <= 165.853 )
				if( atr2 <= 1.54465 )
					if( up1 <= 159.792 )
						if( dn <= 95.6159 )
							if( up <= 91.9434 )
								if( atr <= 0.706853 )
									ret := -0.597826
								if( atr > 0.706853 )
									ret := 0.377953
							if( up > 91.9434 )
								if( dn <= 95.4875 )
									ret := 0.958333 // buy
								if( dn > 95.4875 )
									ret := 0.214286
						if( dn > 95.6159 )
							if( up1 <= 102.36 )
								if( dn1 <= 103.447 )
									ret := -0.013836
								if( dn1 > 103.447 )
									ret := -0.373333
							if( up1 > 102.36 )
								if( dn1 <= 114.281 )
									ret := 0.128101
								if( dn1 > 114.281 )
									ret := -0.002511
					if( up1 > 159.792 )
						if( dn <= 162.311 )
							if( dn <= 161.875 )
								ret := 0.266667
							if( dn > 161.875 )
								if( atr2 <= 0.233213 )
									ret := 0.444444
								if( atr2 > 0.233213 )
									ret := 0.944444 // buy
						if( dn > 162.311 )
							if( dn <= 164.888 )
								if( up <= 160.985 )
									ret := 0.310484
								if( up > 160.985 )
									ret := -0.138824
							if( dn > 164.888 )
								if( atr2 <= 0.94357 )
									ret := 0.360000
								if( atr2 > 0.94357 )
									ret := -0.809524 // sell
				if( atr2 > 1.54465 )
					if( dn <= 118.044 )
						if( atr2 <= 1.5869 )
							ret := -0.100000
						if( atr2 > 1.5869 )
							if( atr2 <= 1.61507 )
								ret := 0.666667
							if( atr2 > 1.61507 )
								if( atr <= 1.60701 )
									ret := 0.818182 // buy
								if( atr > 1.60701 )
									ret := 1.000000 // buy
					if( dn > 118.044 )
						if( atr <= 1.37871 )
							if( up <= 126.747 )
								if( atr2 <= 1.71599 )
									ret := -0.907407 // sell
								if( atr2 > 1.71599 )
									ret := 0.555556
							if( up > 126.747 )
								if( atr2 <= 1.6823 )
									ret := 0.474576
								if( atr2 > 1.6823 )
									ret := -0.292683
						if( atr > 1.37871 )
							if( atr2 <= 1.74534 )
								if( up <= 130.748 )
									ret := -0.119403
								if( up > 130.748 )
									ret := 0.512456
							if( atr2 > 1.74534 )
								if( up <= 141.467 )
									ret := 0.415842
								if( up > 141.467 )
									ret := -0.112500
			if( dn1 > 165.853 )
				if( atr <= 0.763469 )
					if( up1 <= 182.932 )
						if( up <= 182.38 )
							if( dn1 <= 174.745 )
								if( up1 <= 168.554 )
									ret := 0.041972
								if( up1 > 168.554 )
									ret := -0.157567
							if( dn1 > 174.745 )
								if( atr2 <= 0.792144 )
									ret := 0.057965
								if( atr2 > 0.792144 )
									ret := -0.275701
						if( up > 182.38 )
							if( up <= 182.927 )
								if( dn1 <= 184.907 )
									ret := 0.020000
								if( dn1 > 184.907 )
									ret := 0.605948
							if( up > 182.927 )
								if( dn1 <= 187.424 )
									ret := 0.000000
								if( dn1 > 187.424 )
									ret := -0.727273 // sell
					if( up1 > 182.932 )
						if( up <= 184.311 )
							if( dn1 <= 185.657 )
								if( atr2 <= 0.393 )
									ret := -0.082569
								if( atr2 > 0.393 )
									ret := 0.866667 // buy
							if( dn1 > 185.657 )
								if( dn1 <= 185.89 )
									ret := -0.816327 // sell
								if( dn1 > 185.89 )
									ret := -0.215159
						if( up > 184.311 )
							if( up <= 185.818 )
								if( atr <= 0.363065 )
									ret := -0.227723
								if( atr > 0.363065 )
									ret := 0.292683
							if( up > 185.818 )
								if( dn1 <= 187.853 )
									ret := -0.800000 // sell
								if( dn1 > 187.853 )
									ret := -0.038714
				if( atr > 0.763469 )
					if( up1 <= 157.269 )
						if( up1 <= 156.496 )
							if( dn1 <= 166.826 )
								if( up1 <= 156.175 )
									ret := 0.968750 // buy
								if( up1 > 156.175 )
									ret := 0.727273 // buy
							if( dn1 > 166.826 )
								ret := 0.454545
						if( up1 > 156.496 )
							ret := 1.000000 // buy
					if( up1 > 157.269 )
						if( up1 <= 158.952 )
							if( dn <= 167.347 )
								if( atr <= 1.46682 )
									ret := -0.607843
								if( atr > 1.46682 )
									ret := -0.951220 // sell
							if( dn > 167.347 )
								if( dn1 <= 168.475 )
									ret := 0.192308
								if( dn1 > 168.475 )
									ret := -0.694444
						if( up1 > 158.952 )
							if( atr <= 0.989771 )
								if( trend <= -0.522206 )
									ret := 0.213333
								if( trend > -0.522206 )
									ret := -0.116660
							if( atr > 0.989771 )
								if( up <= 197.615 )
									ret := -0.053588
								if( up > 197.615 )
									ret := 0.100983
		if( up > 221.143 )
			if( up <= 265.871 )
				if( dn <= 256.785 )
					if( dn1 <= 252.135 )
						if( up1 <= 245.763 )
							if( up <= 229.576 )
								if( dn1 <= 232.347 )
									ret := 0.000000
								if( dn1 > 232.347 )
									ret := 0.262016
							if( up > 229.576 )
								if( dn <= 250.272 )
									ret := -0.037981
								if( dn > 250.272 )
									ret := 0.676768
						if( up1 > 245.763 )
							if( dn <= 250.274 )
								if( up <= 247.044 )
									ret := 0.916667 // buy
								if( up > 247.044 )
									ret := 1.000000 // buy
							if( dn > 250.274 )
								if( up <= 247.258 )
									ret := 0.275862
								if( up > 247.258 )
									ret := 0.815789 // buy
					if( dn1 > 252.135 )
						if( dn1 <= 252.58 )
							if( atr <= 1.17034 )
								ret := 0.222222
							if( atr > 1.17034 )
								if( atr2 <= 1.34066 )
									ret := -0.777778 // sell
								if( atr2 > 1.34066 )
									ret := -1.000000 // sell
						if( dn1 > 252.58 )
							if( up1 <= 243.784 )
								if( up <= 243.292 )
									ret := 0.000000
								if( up > 243.292 )
									ret := 0.545455
							if( up1 > 243.784 )
								if( dn1 <= 253.489 )
									ret := 0.104167
								if( dn1 > 253.489 )
									ret := -0.257951
				if( dn > 256.785 )
					if( dn <= 266.697 )
						if( up <= 254.192 )
							if( atr2 <= 1.79459 )
								if( atr2 <= 1.38962 )
									ret := 0.755435 // buy
								if( atr2 > 1.38962 )
									ret := 0.470588
							if( atr2 > 1.79459 )
								if( up <= 250.769 )
									ret := -0.551724
								if( up > 250.769 )
									ret := 0.470588
						if( up > 254.192 )
							if( dn1 <= 259.897 )
								if( atr2 <= 0.66953 )
									ret := -1.000000 // sell
								if( atr2 > 0.66953 )
									ret := -0.400000
							if( dn1 > 259.897 )
								if( atr2 <= 1.57931 )
									ret := 0.234714
								if( atr2 > 1.57931 )
									ret := 0.549618
					if( dn > 266.697 )
						if( atr2 <= 0.802505 )
							if( dn1 <= 269.537 )
								if( dn1 <= 268.921 )
									ret := 0.578125
								if( dn1 > 268.921 )
									ret := -0.171429
							if( dn1 > 269.537 )
								if( dn1 <= 270.058 )
									ret := 1.000000 // buy
								if( dn1 > 270.058 )
									ret := 0.615385
						if( atr2 > 0.802505 )
							if( atr <= 1.75022 )
								if( up <= 260.396 )
									ret := -0.390863
								if( up > 260.396 )
									ret := 0.020661
							if( atr > 1.75022 )
								if( atr2 <= 1.57145 )
									ret := -0.307692
								if( atr2 > 1.57145 )
									ret := 0.525641
			if( up > 265.871 )
				if( up1 <= 398.046 )
					if( dn1 <= 406.443 )
						if( atr <= 1.51032 )
							if( atr2 <= 1.28104 )
								if( dn1 <= 270.717 )
									ret := -0.513514
								if( dn1 > 270.717 )
									ret := 0.013584
							if( atr2 > 1.28104 )
								if( dn <= 276.229 )
									ret := 0.114504
								if( dn > 276.229 )
									ret := -0.143969
						if( atr > 1.51032 )
							if( dn1 <= 283.689 )
								if( up <= 273.528 )
									ret := 0.033592
								if( up > 273.528 )
									ret := -0.839286 // sell
							if( dn1 > 283.689 )
								if( up <= 278.143 )
									ret := 0.551351
								if( up > 278.143 )
									ret := 0.109568
					if( dn1 > 406.443 )
						ret := -1.000000 // sell
				if( up1 > 398.046 )
					if( up1 <= 494.501 )
						if( atr2 <= 1.86434 )
							if( up1 <= 491.153 )
								if( up1 <= 463.844 )
									ret := 0.486395
								if( up1 > 463.844 )
									ret := 0.081797
							if( up1 > 491.153 )
								if( atr2 <= 1.19952 )
									ret := 0.758621 // buy
								if( atr2 > 1.19952 )
									ret := 0.419355
						if( atr2 > 1.86434 )
							if( up1 <= 462.527 )
								ret := 0.142857
							if( up1 > 462.527 )
								if( atr <= 1.76945 )
									ret := 0.794872 // buy
								if( atr > 1.76945 )
									ret := 0.400000
					if( up1 > 494.501 )
						if( dn1 <= 511.607 )
							if( dn1 <= 506.026 )
								if( up1 <= 495.403 )
									ret := -0.680851
								if( up1 > 495.403 )
									ret := 0.234234
							if( dn1 > 506.026 )
								if( atr2 <= 0.668108 )
									ret := 0.136364
								if( atr2 > 0.668108 )
									ret := -0.544379
						if( dn1 > 511.607 )
							if( up1 <= 515.454 )
								if( atr2 <= 1.53709 )
									ret := 0.236667
								if( atr2 > 1.53709 )
									ret := 0.585859
							if( up1 > 515.454 )
								if( dn1 <= 527.383 )
									ret := -0.590909
								if( dn1 > 527.383 )
									ret := 0.030797
	if( atr > 1.83168 )
		if( up1 <= 303.358 )
			if( up <= 252.418 )
				if( dn1 <= 241.44 )
					if( dn1 <= 200.128 )
						if( up1 <= 177.378 )
							if( atr2 <= 2.70599 )
								if( up1 <= 135.83 )
									ret := -0.413043
								if( up1 > 135.83 )
									ret := -0.092449
							if( atr2 > 2.70599 )
								if( dn <= 180.75 )
									ret := 0.040067
								if( dn > 180.75 )
									ret := 0.415301
						if( up1 > 177.378 )
							if( up <= 186.731 )
								if( dn1 <= 197.461 )
									ret := 0.102719
								if( dn1 > 197.461 )
									ret := 0.644444
							if( up > 186.731 )
								if( up1 <= 187.313 )
									ret := -0.612903
								if( up1 > 187.313 )
									ret := 0.431818
					if( dn1 > 200.128 )
						if( up <= 201.373 )
							if( up1 <= 194.698 )
								if( atr2 <= 1.59055 )
									ret := 0.736842 // buy
								if( atr2 > 1.59055 )
									ret := -0.241554
							if( up1 > 194.698 )
								if( dn1 <= 208.635 )
									ret := -0.085366
								if( dn1 > 208.635 )
									ret := -0.699670
						if( up > 201.373 )
							if( up1 <= 223.56 )
								if( dn <= 212.878 )
									ret := -0.615385
								if( dn > 212.878 )
									ret := 0.078464
							if( up1 > 223.56 )
								if( up1 <= 224.989 )
									ret := -0.894737 // sell
								if( up1 > 224.989 )
									ret := -0.358025
				if( dn1 > 241.44 )
					if( atr2 <= 1.78864 )
						if( up1 <= 238.725 )
							if( atr2 <= 1.63966 )
								ret := 0.000000
							if( atr2 > 1.63966 )
								ret := 0.888889 // buy
						if( up1 > 238.725 )
							if( atr2 <= 1.67301 )
								ret := 1.000000 // buy
							if( atr2 > 1.67301 )
								ret := 0.625000
					if( atr2 > 1.78864 )
						if( dn <= 249.099 )
							if( atr2 <= 3.35955 )
								if( dn <= 241.884 )
									ret := 0.250000
								if( dn > 241.884 )
									ret := 0.588235
							if( atr2 > 3.35955 )
								ret := -0.727273 // sell
						if( dn > 249.099 )
							if( atr <= 12.6809 )
								if( atr <= 4.32043 )
									ret := 0.060890
								if( atr > 4.32043 )
									ret := -0.901961 // sell
							if( atr > 12.6809 )
								ret := 1.000000 // buy
			if( up > 252.418 )
				if( up1 <= 279.182 )
					if( dn1 <= 287.218 )
						if( atr2 <= 2.15456 )
							if( up1 <= 259.215 )
								if( atr <= 2.0806 )
									ret := -0.464912
								if( atr > 2.0806 )
									ret := -0.136986
							if( up1 > 259.215 )
								if( up1 <= 261.329 )
									ret := 0.482353
								if( up1 > 261.329 )
									ret := 0.075000
						if( atr2 > 2.15456 )
							if( dn <= 286.56 )
								if( dn1 <= 281.972 )
									ret := -0.233449
								if( dn1 > 281.972 )
									ret := -0.450000
							if( dn > 286.56 )
								ret := 0.666667
					if( dn1 > 287.218 )
						if( atr2 <= 6.08313 )
							if( dn <= 295.559 )
								if( dn1 <= 295.335 )
									ret := -0.523466
								if( dn1 > 295.335 )
									ret := 0.058824
							if( dn > 295.559 )
								if( dn <= 304.696 )
									ret := -0.812500 // sell
								if( dn > 304.696 )
									ret := 0.285714
						if( atr2 > 6.08313 )
							if( up1 <= 263.871 )
								ret := -0.428571
							if( up1 > 263.871 )
								if( up <= 272.807 )
									ret := 0.782609 // buy
								if( up > 272.807 )
									ret := -0.272727
				if( up1 > 279.182 )
					if( up1 <= 287.732 )
						if( atr <= 2.24668 )
							if( atr <= 1.8952 )
								if( atr <= 1.85676 )
									ret := -0.235294
								if( atr > 1.85676 )
									ret := -0.875000 // sell
							if( atr > 1.8952 )
								if( up <= 284.465 )
									ret := -0.353659
								if( up > 284.465 )
									ret := 0.307692
						if( atr > 2.24668 )
							if( dn <= 303.446 )
								if( up1 <= 285.82 )
									ret := 0.156250
								if( up1 > 285.82 )
									ret := 0.500000
							if( dn > 303.446 )
								if( atr2 <= 4.0828 )
									ret := 0.894737 // buy
								if( atr2 > 4.0828 )
									ret := 0.500000
					if( up1 > 287.732 )
						if( dn1 <= 323.544 )
							if( up1 <= 290.134 )
								if( dn1 <= 302.179 )
									ret := -0.692308
								if( dn1 > 302.179 )
									ret := -0.222222
							if( up1 > 290.134 )
								if( up <= 294.758 )
									ret := 0.123944
								if( up > 294.758 )
									ret := -0.262937
						if( dn1 > 323.544 )
							ret := 0.888889 // buy
		if( up1 > 303.358 )
			if( dn1 <= 323.459 )
				if( atr <= 2.13641 )
					if( up <= 309.678 )
						if( up1 <= 307.547 )
							if( up1 <= 306.82 )
								if( up <= 306.388 )
									ret := 0.514706
								if( up > 306.388 )
									ret := 0.958333 // buy
							if( up1 > 306.82 )
								if( atr <= 2.00231 )
									ret := 0.400000
								if( atr > 2.00231 )
									ret := -0.666667
						if( up1 > 307.547 )
							if( atr <= 2.00703 )
								ret := 0.466667
							if( atr > 2.00703 )
								ret := 1.000000 // buy
					if( up > 309.678 )
						if( up1 <= 309.756 )
							ret := -0.545455
						if( up1 > 309.756 )
							if( atr2 <= 2.30535 )
								if( dn1 <= 321.363 )
									ret := 0.833333 // buy
								if( dn1 > 321.363 )
									ret := -0.250000
							if( atr2 > 2.30535 )
								ret := 0.875000 // buy
				if( atr > 2.13641 )
					if( dn <= 317.391 )
						if( atr2 <= 1.80107 )
							ret := -1.000000 // sell
						if( atr2 > 1.80107 )
							if( up <= 304.088 )
								ret := -0.727273 // sell
							if( up > 304.088 )
								ret := -0.615385
					if( dn > 317.391 )
						if( dn <= 323.04 )
							if( atr <= 2.22453 )
								if( atr2 <= 2.23871 )
									ret := 0.444444
								if( atr2 > 2.23871 )
									ret := 0.904762 // buy
							if( atr > 2.22453 )
								if( atr2 <= 2.27044 )
									ret := -0.210526
								if( atr2 > 2.27044 )
									ret := 0.471698
						if( dn > 323.04 )
							ret := -0.727273 // sell
			if( dn1 > 323.459 )
				if( up <= 314.145 )
					if( atr2 <= 4.55417 )
						if( atr <= 3.25488 )
							if( dn1 <= 324.406 )
								if( dn <= 323.205 )
									ret := 0.000000
								if( dn > 323.205 )
									ret := -0.800000 // sell
							if( dn1 > 324.406 )
								if( dn <= 331.135 )
									ret := -0.206522
								if( dn > 331.135 )
									ret := -1.000000 // sell
						if( atr > 3.25488 )
							if( atr <= 4.28191 )
								if( dn1 <= 335.544 )
									ret := -0.977778 // sell
								if( dn1 > 335.544 )
									ret := -0.800000 // sell
							if( atr > 4.28191 )
								ret := -0.625000
					if( atr2 > 4.55417 )
						if( dn1 <= 347.025 )
							if( up1 <= 308.762 )
								ret := 1.000000 // buy
							if( up1 > 308.762 )
								ret := 0.625000
						if( dn1 > 347.025 )
							ret := 0.000000
				if( up > 314.145 )
					if( up1 <= 322.388 )
						if( up1 <= 321.846 )
							if( dn1 <= 335.846 )
								if( atr <= 2.28476 )
									ret := 0.147465
								if( atr > 2.28476 )
									ret := 0.532374
							if( dn1 > 335.846 )
								if( up <= 317.043 )
									ret := -0.733333 // sell
								if( up > 317.043 )
									ret := -0.236364
						if( up1 > 321.846 )
							if( atr2 <= 2.35576 )
								if( up <= 323.288 )
									ret := 0.909091 // buy
								if( up > 323.288 )
									ret := 1.000000 // buy
							if( atr2 > 2.35576 )
								ret := 0.722222 // buy
					if( up1 > 322.388 )
						if( dn <= 599.191 )
							if( up <= 328.778 )
								if( up1 <= 325.489 )
									ret := -0.135678
								if( up1 > 325.489 )
									ret := -0.414141
							if( up > 328.778 )
								if( dn1 <= 473.761 )
									ret := 0.093164
								if( dn1 > 473.761 )
									ret := -0.053461
						if( dn > 599.191 )
							if( up1 <= 586.029 )
								ret := -0.727273 // sell
							if( up1 > 586.029 )
								if( dn1 <= 602.931 )
									ret := -1.000000 // sell
								if( dn1 > 602.931 )
									ret := -0.916667 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator SuperTrend 
//@version=5
//indicator title="Supertrend", overlay=true, format=format.price, precision=2, timeframe="")

Periods = input.int(title="ATR Period", defval=10)
src = input.source(hl2, title="Source")
Multiplier = input.float(title="ATR Multiplier", step=0.1, defval=3.0)
changeATR = input.bool(title="Change ATR Calculation Method?", defval=true)
showsignals = input.bool(title="Show Buy/Sell Signals?", defval=true)
highlighting = input.bool(title="Highlighter On/Off?", defval=true)

atr2 = ta.sma(ta.tr, Periods)
atr = changeATR ? ta.atr(Periods) : atr2

up = src - (Multiplier * atr)
up1 = nz(up[1], up)
up := close[1] > up1 ? math.max(up, up1) : up

dn = src + (Multiplier * atr)
dn1 = nz(dn[1], dn)
dn := close[1] < dn1 ? math.min(dn, dn1) : dn

var trend = 1
trend := nz(trend[1], trend)
trend := trend == -1 and close > dn1 ? 1 : trend == 1 and close < up1 ? -1 : trend

upPlot = plot(trend == 1 ? up : na, title="Up Trend", style=plot.style_linebr, linewidth=2, color=color.green)
dnPlot = plot(trend == 1 ? na : dn, title="Down Trend", style=plot.style_linebr, linewidth=2, color=color.red)

buySignal = trend == 1 and trend[1] == -1
sellSignal = trend == -1 and trend[1] == 1

plotshape(buySignal, title="UpTrend Begins", location=location.absolute, style=shape.circle, size=size.tiny, color=color.green, textcolor=color.white)
plotshape(sellSignal, title="DownTrend Begins", location=location.absolute, style=shape.circle, size=size.tiny, color=color.red, textcolor=color.white)

plotshape(showsignals and buySignal, title="Buy", text="Buy", location=location.absolute, style=shape.labelup, size=size.tiny, color=color.green, textcolor=color.white)
plotshape(showsignals and sellSignal, title="Sell", text="Sell", location=location.absolute, style=shape.labeldown, size=size.tiny, color=color.red, textcolor=color.white)

mPlot = plot(ohlc4, title="", style=plot.style_circles, linewidth=1)

longFillColor = highlighting ? (trend == 1 ? color.new(color.green, 80) : color.new(color.white, 100)) : color.new(color.white, 100)
shortFillColor = highlighting ? (trend == -1 ? color.new(color.red, 80) : color.new(color.white, 100)) : color.new(color.white, 100)

fill(mPlot, upPlot, title="UpTrend Highlighter", color=longFillColor)
fill(mPlot, dnPlot, title="DownTrend Highlighter", color=shortFillColor)

alertcondition(buySignal, title="SuperTrend Buy", message="SuperTrend Buy!")
alertcondition(sellSignal, title="SuperTrend Sell", message="SuperTrend Sell!")
changeCond = trend != trend[1]
alertcondition(changeCond, title="SuperTrend Direction Change", message="SuperTrend has changed direction!")

buySignalInt = buySignal ? 1: 0   //Bool to int
sellSignalInt = sellSignal ? 1: 0   //Bool to int

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
float op_operation = decision_tree_0_META_30Min_9052deff(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)

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


