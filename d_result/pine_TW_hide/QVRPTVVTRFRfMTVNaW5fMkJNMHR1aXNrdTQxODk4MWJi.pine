//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: ATOMUSDT_15Min_2BM0_418981bb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_15Min_2BM0_418981bb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_15Min_418981bb(bullPower, bbp, bearPower, bbm, BBPower_Color, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.109103 )
		if( Typical_Price <= 10.8868 )
			if( Positive_Money_Flow_Sum <= 1.53472e+06 )
				if( bullPower <= -0.083911 )
					if( Money_Flow_Ratio <= 0.120015 )
						if( Typical_Price <= 9.42212 )
							if( Negative_Money_Flow_Sum <= 4.69428e+06 )
								if( bearPower <= -0.296843 )
									ret := 0.875000 // buy
								if( bearPower > -0.296843 )
									ret := -0.157895
							if( Negative_Money_Flow_Sum > 4.69428e+06 )
								if( Raw_Money_Flow <= 413087 )
									ret := 0.259259
								if( Raw_Money_Flow > 413087 )
									ret := 0.744186 // buy
						if( Typical_Price > 9.42212 )
							if( Raw_Money_Flow <= 572281 )
								if( Typical_Price <= 9.98841 )
									ret := -0.120000
								if( Typical_Price > 9.98841 )
									ret := 0.586957
							if( Raw_Money_Flow > 572281 )
								if( Negative_Money_Flow_Sum <= 7.49886e+06 )
									ret := -0.531250
								if( Negative_Money_Flow_Sum > 7.49886e+06 )
									ret := 0.209302
					if( Money_Flow_Ratio > 0.120015 )
						if( bullPower <= -0.114213 )
							if( bbp <= -0.639777 )
								ret := 1.000000 // buy
							if( bbp > -0.639777 )
								if( Negative_Money_Flow_Sum <= 3.34175e+06 )
									ret := 0.333333
								if( Negative_Money_Flow_Sum > 3.34175e+06 )
									ret := -0.377551
						if( bullPower > -0.114213 )
							if( Positive_Money_Flow_Sum <= 1.15012e+06 )
								if( MFI <= 16.8146 )
									ret := 0.131034
								if( MFI > 16.8146 )
									ret := -0.258993
							if( Positive_Money_Flow_Sum > 1.15012e+06 )
								if( Positive_Money_Flow <= 288840 )
									ret := 0.463158
								if( Positive_Money_Flow > 288840 )
									ret := -0.450000
				if( bullPower > -0.083911 )
					if( bearPower <= -0.070098 )
						if( Negative_Money_Flow_Sum <= 3.35837e+06 )
							if( Raw_Money_Flow <= 128678 )
								if( Money_Flow_Ratio <= 0.158965 )
									ret := 0.366667
								if( Money_Flow_Ratio > 0.158965 )
									ret := -0.002809
							if( Raw_Money_Flow > 128678 )
								if( Typical_Price <= 4.98133 )
									ret := -0.047059
								if( Typical_Price > 4.98133 )
									ret := 0.249001
						if( Negative_Money_Flow_Sum > 3.35837e+06 )
							if( bearPower <= -0.209319 )
								if( Typical_Price <= 8.54085 )
									ret := -0.125000
								if( Typical_Price > 8.54085 )
									ret := 0.545455
							if( bearPower > -0.209319 )
								if( Negative_Money_Flow <= 293726 )
									ret := -0.114634
								if( Negative_Money_Flow > 293726 )
									ret := 0.117207
					if( bearPower > -0.070098 )
						if( Typical_Price <= 6.58514 )
							if( bullPower <= -0.045298 )
								ret := -0.250000
							if( bullPower > -0.045298 )
								ret := 0.750000 // buy
						if( Typical_Price > 6.58514 )
							if( Negative_Money_Flow <= 85983.2 )
								if( Positive_Money_Flow_Sum <= 268286 )
									ret := 0.142857
								if( Positive_Money_Flow_Sum > 268286 )
									ret := -0.538462
							if( Negative_Money_Flow > 85983.2 )
								if( Typical_Price <= 9.54056 )
									ret := -0.923077 // sell
								if( Typical_Price > 9.54056 )
									ret := -0.250000
			if( Positive_Money_Flow_Sum > 1.53472e+06 )
				if( bbp <= -0.195293 )
					if( Raw_Money_Flow <= 1.41493e+06 )
						if( Negative_Money_Flow_Sum <= 5.60652e+06 )
							if( Negative_Money_Flow_Sum <= 5.11449e+06 )
								if( Negative_Money_Flow <= 1.06785e+06 )
									ret := 0.434156
								if( Negative_Money_Flow > 1.06785e+06 )
									ret := -0.157895
							if( Negative_Money_Flow_Sum > 5.11449e+06 )
								if( Money_Flow_Ratio <= 0.335511 )
									ret := 0.945946 // buy
								if( Money_Flow_Ratio > 0.335511 )
									ret := 0.685393
						if( Negative_Money_Flow_Sum > 5.60652e+06 )
							if( Negative_Money_Flow_Sum <= 7.05205e+06 )
								if( Positive_Money_Flow_Sum <= 2.34184e+06 )
									ret := 0.214286
								if( Positive_Money_Flow_Sum > 2.34184e+06 )
									ret := -0.327273
							if( Negative_Money_Flow_Sum > 7.05205e+06 )
								if( MFI_High <= -33.2358 )
									ret := 0.416244
								if( MFI_High > -33.2358 )
									ret := -0.444444
					if( Raw_Money_Flow > 1.41493e+06 )
						if( Positive_Money_Flow_Sum <= 1.69055e+06 )
							if( bbm <= 0.218442 )
								ret := -1.000000 // sell
							if( bbm > 0.218442 )
								ret := 0.500000
						if( Positive_Money_Flow_Sum > 1.69055e+06 )
							if( Negative_Money_Flow <= 137873 )
								if( Positive_Money_Flow <= 2.83394e+06 )
									ret := 0.000000
								if( Positive_Money_Flow > 2.83394e+06 )
									ret := 0.909091 // buy
							if( Negative_Money_Flow > 137873 )
								if( Money_Flow_Ratio <= 0.206572 )
									ret := 0.413793
								if( Money_Flow_Ratio > 0.206572 )
									ret := 0.763033 // buy
				if( bbp > -0.195293 )
					if( Negative_Money_Flow_Sum <= 4.51302e+06 )
						if( MFI_Low <= 21.9471 )
							if( Negative_Money_Flow_Sum <= 4.32792e+06 )
								if( MFI_Low <= 10.3719 )
									ret := -0.235294
								if( MFI_Low > 10.3719 )
									ret := 0.397849
							if( Negative_Money_Flow_Sum > 4.32792e+06 )
								if( Positive_Money_Flow <= 552779 )
									ret := 0.861111 // buy
								if( Positive_Money_Flow > 552779 )
									ret := 0.333333
						if( MFI_Low > 21.9471 )
							if( bbm <= 0.138688 )
								if( Typical_Price <= 8.24785 )
									ret := 0.415584
								if( Typical_Price > 8.24785 )
									ret := 0.078431
							if( bbm > 0.138688 )
								if( Negative_Money_Flow_Sum <= 2.96404e+06 )
									ret := 0.783784 // buy
								if( Negative_Money_Flow_Sum > 2.96404e+06 )
									ret := 0.250000
					if( Negative_Money_Flow_Sum > 4.51302e+06 )
						if( Raw_Money_Flow <= 494811 )
							if( Negative_Money_Flow_Sum <= 5.07473e+06 )
								if( Negative_Money_Flow_Sum <= 4.89247e+06 )
									ret := 0.122449
								if( Negative_Money_Flow_Sum > 4.89247e+06 )
									ret := -0.566667
							if( Negative_Money_Flow_Sum > 5.07473e+06 )
								if( Negative_Money_Flow_Sum <= 8.69684e+06 )
									ret := 0.427481
								if( Negative_Money_Flow_Sum > 8.69684e+06 )
									ret := -0.175000
						if( Raw_Money_Flow > 494811 )
							if( Negative_Money_Flow_Sum <= 7.75254e+06 )
								if( Positive_Money_Flow_Sum <= 5.85058e+06 )
									ret := -0.283784
								if( Positive_Money_Flow_Sum > 5.85058e+06 )
									ret := 0.433333
							if( Negative_Money_Flow_Sum > 7.75254e+06 )
								if( Positive_Money_Flow_Sum <= 1.19951e+07 )
									ret := 0.441558
								if( Positive_Money_Flow_Sum > 1.19951e+07 )
									ret := -0.750000 // sell
		if( Typical_Price > 10.8868 )
			if( MFI_High <= -39.8582 )
				if( Raw_Money_Flow <= 582182 )
					if( Positive_Money_Flow_Sum <= 1.60902e+06 )
						if( Typical_Price <= 15.2033 )
							if( Raw_Money_Flow <= 338673 )
								if( Negative_Money_Flow_Sum <= 2.59107e+06 )
									ret := -0.013311
								if( Negative_Money_Flow_Sum > 2.59107e+06 )
									ret := 0.190850
							if( Raw_Money_Flow > 338673 )
								if( bearPower <= -0.140537 )
									ret := -0.025157
								if( bearPower > -0.140537 )
									ret := -0.279279
						if( Typical_Price > 15.2033 )
							if( Negative_Money_Flow_Sum <= 9.15614e+06 )
								if( bbp <= -0.438326 )
									ret := 0.250000
								if( bbp > -0.438326 )
									ret := -0.622222
							if( Negative_Money_Flow_Sum > 9.15614e+06 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 1.60902e+06 )
						if( MFI_Low <= 16.0054 )
							if( Positive_Money_Flow_Sum <= 1.74102e+06 )
								if( Raw_Money_Flow <= 475480 )
									ret := 0.586207
								if( Raw_Money_Flow > 475480 )
									ret := -0.136364
							if( Positive_Money_Flow_Sum > 1.74102e+06 )
								if( Negative_Money_Flow_Sum <= 4.73017e+06 )
									ret := -0.298611
								if( Negative_Money_Flow_Sum > 4.73017e+06 )
									ret := 0.196605
						if( MFI_Low > 16.0054 )
							if( Typical_Price <= 12.0001 )
								if( Negative_Money_Flow_Sum <= 6.61236e+06 )
									ret := 0.730435 // buy
								if( Negative_Money_Flow_Sum > 6.61236e+06 )
									ret := 0.071429
							if( Typical_Price > 12.0001 )
								if( bbm <= 0.135817 )
									ret := 0.050725
								if( bbm > 0.135817 )
									ret := 0.510638
				if( Raw_Money_Flow > 582182 )
					if( Positive_Money_Flow_Sum <= 1.83339e+06 )
						if( bbm <= 0.182676 )
							if( bullPower <= -0.040094 )
								if( Positive_Money_Flow_Sum <= 369077 )
									ret := -0.529412
								if( Positive_Money_Flow_Sum > 369077 )
									ret := 0.330409
							if( bullPower > -0.040094 )
								if( Typical_Price <= 13.3939 )
									ret := -0.128440
								if( Typical_Price > 13.3939 )
									ret := 0.666667
						if( bbm > 0.182676 )
							if( Negative_Money_Flow_Sum <= 2.61524e+06 )
								if( Negative_Money_Flow <= 965028 )
									ret := 0.857143 // buy
								if( Negative_Money_Flow > 965028 )
									ret := -0.818182 // sell
							if( Negative_Money_Flow_Sum > 2.61524e+06 )
								if( Raw_Money_Flow <= 2.92282e+06 )
									ret := 0.591603
								if( Raw_Money_Flow > 2.92282e+06 )
									ret := 0.000000
					if( Positive_Money_Flow_Sum > 1.83339e+06 )
						if( Negative_Money_Flow_Sum <= 3.8283e+06 )
							if( bbp <= -0.160388 )
								if( Money_Flow_Ratio <= 0.607049 )
									ret := -0.750000 // sell
								if( Money_Flow_Ratio > 0.607049 )
									ret := -1.000000 // sell
							if( bbp > -0.160388 )
								ret := 0.250000
						if( Negative_Money_Flow_Sum > 3.8283e+06 )
							if( bullPower <= -0.084373 )
								if( bearPower <= -0.964161 )
									ret := 0.548387
								if( bearPower > -0.964161 )
									ret := 0.043870
							if( bullPower > -0.084373 )
								if( Positive_Money_Flow_Sum <= 5.32617e+06 )
									ret := 0.207474
								if( Positive_Money_Flow_Sum > 5.32617e+06 )
									ret := 0.470833
			if( MFI_High > -39.8582 )
				if( Negative_Money_Flow_Sum <= 2.36779e+07 )
					if( Negative_Money_Flow_Sum <= 1.92627e+07 )
						if( bbm <= 0.183081 )
							if( Positive_Money_Flow <= 487656 )
								if( Raw_Money_Flow <= 267535 )
									ret := -0.137072
								if( Raw_Money_Flow > 267535 )
									ret := 0.110280
							if( Positive_Money_Flow > 487656 )
								if( bbm <= 0.109375 )
									ret := 0.057692
								if( bbm > 0.109375 )
									ret := -0.527473
						if( bbm > 0.183081 )
							if( bbp <= -0.523833 )
								if( Positive_Money_Flow_Sum <= 1.08186e+07 )
									ret := 0.812500 // buy
								if( Positive_Money_Flow_Sum > 1.08186e+07 )
									ret := 0.214286
							if( bbp > -0.523833 )
								if( Negative_Money_Flow_Sum <= 8.78667e+06 )
									ret := -0.120879
								if( Negative_Money_Flow_Sum > 8.78667e+06 )
									ret := -0.466102
					if( Negative_Money_Flow_Sum > 1.92627e+07 )
						if( bullPower <= -0.291013 )
							ret := 0.250000
						if( bullPower > -0.291013 )
							ret := 1.000000 // buy
				if( Negative_Money_Flow_Sum > 2.36779e+07 )
					ret := -1.000000 // sell
	if( bbp > -0.109103 )
		if( Positive_Money_Flow_Sum <= 440788 )
			if( Negative_Money_Flow_Sum <= 525321 )
				if( Typical_Price <= 4.95908 )
					if( Negative_Money_Flow_Sum <= 469024 )
						if( MFI <= 50.3628 )
							if( bbm <= 0.049718 )
								if( Negative_Money_Flow_Sum <= 284834 )
									ret := 0.154362
								if( Negative_Money_Flow_Sum > 284834 )
									ret := -0.081886
							if( bbm > 0.049718 )
								if( Positive_Money_Flow_Sum <= 248996 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 248996 )
									ret := 0.750000 // buy
						if( MFI > 50.3628 )
							if( bullPower <= 0.004933 )
								if( Positive_Money_Flow_Sum <= 416556 )
									ret := 0.326531
								if( Positive_Money_Flow_Sum > 416556 )
									ret := 0.850000 // buy
							if( bullPower > 0.004933 )
								if( BBPower_Color <= 0.5 )
									ret := 0.358025
								if( BBPower_Color > 0.5 )
									ret := 0.034404
					if( Negative_Money_Flow_Sum > 469024 )
						if( Raw_Money_Flow <= 66301 )
							if( bearPower <= -0.010532 )
								if( Positive_Money_Flow <= 29994.6 )
									ret := 0.800000 // buy
								if( Positive_Money_Flow > 29994.6 )
									ret := 0.416667
							if( bearPower > -0.010532 )
								if( Positive_Money_Flow_Sum <= 210125 )
									ret := 0.700000 // buy
								if( Positive_Money_Flow_Sum > 210125 )
									ret := 0.047619
						if( Raw_Money_Flow > 66301 )
							if( Negative_Money_Flow_Sum <= 509848 )
								if( bullPower <= 0.00482 )
									ret := 0.363636
								if( bullPower > 0.00482 )
									ret := -0.142857
							if( Negative_Money_Flow_Sum > 509848 )
								if( bbm <= 0.039397 )
									ret := -1.000000 // sell
								if( bbm > 0.039397 )
									ret := -0.250000
				if( Typical_Price > 4.95908 )
					if( bbm <= 0.021642 )
						if( Positive_Money_Flow <= 23882.4 )
							if( bbm <= 0.021375 )
								if( MFI <= 67.461 )
									ret := -0.028609
								if( MFI > 67.461 )
									ret := -0.215827
							if( bbm > 0.021375 )
								if( bbp <= -0.01011 )
									ret := 1.000000 // buy
								if( bbp > -0.01011 )
									ret := 0.500000
						if( Positive_Money_Flow > 23882.4 )
							if( Negative_Money_Flow <= 200.877 )
								if( bbm <= 0.016244 )
									ret := 0.020970
								if( bbm > 0.016244 )
									ret := 0.129264
							if( Negative_Money_Flow > 200.877 )
								ret := 1.000000 // buy
					if( bbm > 0.021642 )
						if( Negative_Money_Flow <= 42783.3 )
							if( BBPower_Color <= 0.5 )
								if( bearPower <= -0.006438 )
									ret := -0.146538
								if( bearPower > -0.006438 )
									ret := -0.818182 // sell
							if( BBPower_Color > 0.5 )
								if( MFI_Low <= 18.2921 )
									ret := 0.205882
								if( MFI_Low > 18.2921 )
									ret := -0.066667
						if( Negative_Money_Flow > 42783.3 )
							if( bbm <= 0.031013 )
								if( Typical_Price <= 9.2695 )
									ret := -0.055980
								if( Typical_Price > 9.2695 )
									ret := -0.344828
							if( bbm > 0.031013 )
								if( Negative_Money_Flow <= 57358.3 )
									ret := 0.457627
								if( Negative_Money_Flow > 57358.3 )
									ret := 0.108434
			if( Negative_Money_Flow_Sum > 525321 )
				if( bearPower <= -0.052187 )
					if( Negative_Money_Flow_Sum <= 1.07168e+06 )
						if( Raw_Money_Flow <= 275322 )
							if( Typical_Price <= 4.88967 )
								if( MFI <= 24.9586 )
									ret := 0.722222 // buy
								if( MFI > 24.9586 )
									ret := -0.090909
							if( Typical_Price > 4.88967 )
								if( bearPower <= -0.06846 )
									ret := -0.344828
								if( bearPower > -0.06846 )
									ret := -0.137097
						if( Raw_Money_Flow > 275322 )
							if( Money_Flow_Ratio <= 0.349415 )
								if( Raw_Money_Flow <= 400236 )
									ret := -0.133333
								if( Raw_Money_Flow > 400236 )
									ret := -1.000000 // sell
							if( Money_Flow_Ratio > 0.349415 )
								if( Typical_Price <= 8.84129 )
									ret := 0.960000 // buy
								if( Typical_Price > 8.84129 )
									ret := 0.000000
					if( Negative_Money_Flow_Sum > 1.07168e+06 )
						if( Positive_Money_Flow <= 132140 )
							if( Positive_Money_Flow <= 102014 )
								if( Negative_Money_Flow <= 569417 )
									ret := 0.185606
								if( Negative_Money_Flow > 569417 )
									ret := -0.625000
							if( Positive_Money_Flow > 102014 )
								if( Positive_Money_Flow <= 114147 )
									ret := -0.761905 // sell
								if( Positive_Money_Flow > 114147 )
									ret := 0.000000
						if( Positive_Money_Flow > 132140 )
							if( Positive_Money_Flow_Sum <= 427877 )
								if( Positive_Money_Flow_Sum <= 412576 )
									ret := 0.638889
								if( Positive_Money_Flow_Sum > 412576 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 427877 )
								ret := -0.166667
				if( bearPower > -0.052187 )
					if( Positive_Money_Flow_Sum <= 396625 )
						if( Typical_Price <= 6.84381 )
							if( Positive_Money_Flow_Sum <= 247268 )
								if( Positive_Money_Flow_Sum <= 212260 )
									ret := -0.010714
								if( Positive_Money_Flow_Sum > 212260 )
									ret := 0.312849
							if( Positive_Money_Flow_Sum > 247268 )
								if( Negative_Money_Flow <= 6760.11 )
									ret := -0.207071
								if( Negative_Money_Flow > 6760.11 )
									ret := 0.052830
						if( Typical_Price > 6.84381 )
							if( MFI <= 28.38 )
								if( MFI_Low <= -11.5149 )
									ret := -0.695652
								if( MFI_Low > -11.5149 )
									ret := -0.177356
							if( MFI > 28.38 )
								if( Money_Flow_Ratio <= 0.468778 )
									ret := 0.077170
								if( Money_Flow_Ratio > 0.468778 )
									ret := -0.127796
					if( Positive_Money_Flow_Sum > 396625 )
						if( Positive_Money_Flow_Sum <= 396793 )
							if( bullPower <= 0.011466 )
								ret := -1.000000 // sell
							if( bullPower > 0.011466 )
								ret := -0.500000
						if( Positive_Money_Flow_Sum > 396793 )
							if( Typical_Price <= 4.65204 )
								if( bullPower <= -0.006273 )
									ret := -0.350000
								if( bullPower > -0.006273 )
									ret := 0.216667
							if( Typical_Price > 4.65204 )
								if( bullPower <= 0.012785 )
									ret := -0.151466
								if( bullPower > 0.012785 )
									ret := -0.322034
		if( Positive_Money_Flow_Sum > 440788 )
			if( Positive_Money_Flow <= 383770 )
				if( Typical_Price <= 13.63 )
					if( Negative_Money_Flow_Sum <= 1.21985e+06 )
						if( bbm <= 0.120083 )
							if( Positive_Money_Flow_Sum <= 4.02363e+06 )
								if( bullPower <= 0.153389 )
									ret := 0.034775
								if( bullPower > 0.153389 )
									ret := -0.272727
							if( Positive_Money_Flow_Sum > 4.02363e+06 )
								if( Positive_Money_Flow_Sum <= 4.21327e+06 )
									ret := -0.678571
								if( Positive_Money_Flow_Sum > 4.21327e+06 )
									ret := -0.114286
						if( bbm > 0.120083 )
							if( Positive_Money_Flow <= 153149 )
								if( Negative_Money_Flow_Sum <= 1.17015e+06 )
									ret := 0.604167
								if( Negative_Money_Flow_Sum > 1.17015e+06 )
									ret := 0.000000
							if( Positive_Money_Flow > 153149 )
								if( Raw_Money_Flow <= 319546 )
									ret := -0.307692
								if( Raw_Money_Flow > 319546 )
									ret := 0.280000
					if( Negative_Money_Flow_Sum > 1.21985e+06 )
						if( Negative_Money_Flow_Sum <= 2.04974e+06 )
							if( bullPower <= 0.005637 )
								if( bbm <= 0.042609 )
									ret := -0.020225
								if( bbm > 0.042609 )
									ret := 0.108802
							if( bullPower > 0.005637 )
								if( Positive_Money_Flow_Sum <= 4.42026e+06 )
									ret := 0.133217
								if( Positive_Money_Flow_Sum > 4.42026e+06 )
									ret := 0.316250
						if( Negative_Money_Flow_Sum > 2.04974e+06 )
							if( MFI <= 31.0214 )
								if( Money_Flow_Ratio <= 0.261829 )
									ret := -0.014199
								if( Money_Flow_Ratio > 0.261829 )
									ret := 0.216242
							if( MFI > 31.0214 )
								if( Negative_Money_Flow_Sum <= 1.39658e+07 )
									ret := 0.026772
								if( Negative_Money_Flow_Sum > 1.39658e+07 )
									ret := -0.559322
				if( Typical_Price > 13.63 )
					if( bbp <= 0.549188 )
						if( Positive_Money_Flow_Sum <= 1.49493e+07 )
							if( Negative_Money_Flow_Sum <= 5.37868e+06 )
								if( Negative_Money_Flow_Sum <= 2.85381e+06 )
									ret := -0.100000
								if( Negative_Money_Flow_Sum > 2.85381e+06 )
									ret := 0.129572
							if( Negative_Money_Flow_Sum > 5.37868e+06 )
								if( MFI <= 38.243 )
									ret := -0.133803
								if( MFI > 38.243 )
									ret := -0.397059
						if( Positive_Money_Flow_Sum > 1.49493e+07 )
							if( Negative_Money_Flow_Sum <= 1.4626e+07 )
								if( Typical_Price <= 16.5192 )
									ret := 0.642202
								if( Typical_Price > 16.5192 )
									ret := -0.545455
							if( Negative_Money_Flow_Sum > 1.4626e+07 )
								ret := -1.000000 // sell
					if( bbp > 0.549188 )
						if( MFI <= 82.4446 )
							if( Typical_Price <= 15.2343 )
								ret := -0.800000 // sell
							if( Typical_Price > 15.2343 )
								if( Money_Flow_Ratio <= 3.71705 )
									ret := 0.750000 // buy
								if( Money_Flow_Ratio > 3.71705 )
									ret := -0.333333
						if( MFI > 82.4446 )
							if( bullPower <= 0.47654 )
								ret := -1.000000 // sell
							if( bullPower > 0.47654 )
								if( MFI <= 88.0752 )
									ret := -1.000000 // sell
								if( MFI > 88.0752 )
									ret := -0.250000
			if( Positive_Money_Flow > 383770 )
				if( Typical_Price <= 11.8622 )
					if( Money_Flow_Ratio <= 10.1717 )
						if( Negative_Money_Flow_Sum <= 6.38342e+06 )
							if( bullPower <= -0.0051 )
								if( Money_Flow_Ratio <= 0.436195 )
									ret := -0.235294
								if( Money_Flow_Ratio > 0.436195 )
									ret := 0.505882
							if( bullPower > -0.0051 )
								if( Raw_Money_Flow <= 833073 )
									ret := 0.006885
								if( Raw_Money_Flow > 833073 )
									ret := 0.115841
						if( Negative_Money_Flow_Sum > 6.38342e+06 )
							if( Positive_Money_Flow <= 849248 )
								if( Positive_Money_Flow <= 514784 )
									ret := -0.306306
								if( Positive_Money_Flow > 514784 )
									ret := 0.098266
							if( Positive_Money_Flow > 849248 )
								if( bbp <= 0.906135 )
									ret := -0.376518
								if( bbp > 0.906135 )
									ret := 0.875000 // buy
					if( Money_Flow_Ratio > 10.1717 )
						if( bullPower <= 0.259527 )
							if( Positive_Money_Flow_Sum <= 6.77529e+06 )
								if( Negative_Money_Flow_Sum <= 415658 )
									ret := -0.355932
								if( Negative_Money_Flow_Sum > 415658 )
									ret := 0.750000 // buy
							if( Positive_Money_Flow_Sum > 6.77529e+06 )
								if( Typical_Price <= 11.1016 )
									ret := -0.962963 // sell
								if( Typical_Price > 11.1016 )
									ret := -0.375000
						if( bullPower > 0.259527 )
							if( bearPower <= 0.218319 )
								if( Typical_Price <= 9.13202 )
									ret := -0.400000
								if( Typical_Price > 9.13202 )
									ret := -0.975610 // sell
							if( bearPower > 0.218319 )
								if( Positive_Money_Flow_Sum <= 1.08233e+07 )
									ret := 0.200000
								if( Positive_Money_Flow_Sum > 1.08233e+07 )
									ret := -0.538462
				if( Typical_Price > 11.8622 )
					if( bearPower <= 0.117537 )
						if( Raw_Money_Flow <= 3.2359e+06 )
							if( Raw_Money_Flow <= 2.0761e+06 )
								if( bullPower <= 0.278527 )
									ret := -0.149668
								if( bullPower > 0.278527 )
									ret := 0.172932
							if( Raw_Money_Flow > 2.0761e+06 )
								if( Typical_Price <= 11.9915 )
									ret := -1.000000 // sell
								if( Typical_Price > 11.9915 )
									ret := 0.307143
						if( Raw_Money_Flow > 3.2359e+06 )
							if( Negative_Money_Flow_Sum <= 7.74356e+06 )
								if( Positive_Money_Flow_Sum <= 1.04148e+07 )
									ret := -0.909091 // sell
								if( Positive_Money_Flow_Sum > 1.04148e+07 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 7.74356e+06 )
								if( Raw_Money_Flow <= 5.16552e+06 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 5.16552e+06 )
									ret := -0.750000 // sell
					if( bearPower > 0.117537 )
						if( MFI_High <= 15.4248 )
							if( Negative_Money_Flow_Sum <= 750397 )
								if( bbm <= 0.089194 )
									ret := 0.333333
								if( bbm > 0.089194 )
									ret := 0.884615 // buy
							if( Negative_Money_Flow_Sum > 750397 )
								if( Positive_Money_Flow_Sum <= 2.43164e+07 )
									ret := 0.003976
								if( Positive_Money_Flow_Sum > 2.43164e+07 )
									ret := 0.593750
						if( MFI_High > 15.4248 )
							if( bbm <= 0.283641 )
								if( Positive_Money_Flow <= 1.94044e+06 )
									ret := -0.750000 // sell
								if( Positive_Money_Flow > 1.94044e+06 )
									ret := -1.000000 // sell
							if( bbm > 0.283641 )
								ret := 0.000000
	
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


//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")

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
float op_operation = decision_tree_0_ATOMUSDT_15Min_418981bb(bullPower, bbp, bearPower, bbm, BBPower_Color, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


