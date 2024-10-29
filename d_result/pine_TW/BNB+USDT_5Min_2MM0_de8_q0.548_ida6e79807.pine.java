//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: BNBUSDT_5Min_2MM0_a6e79807 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_5Min_2MM0_a6e79807", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_5Min_a6e79807(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Typical_Price <= 583.076 )
		if( Short_Long_Diff <= -0.532219 )
			if( Raw_Money_Flow <= 5.31533e+06 )
				if( Short_MA <= 517.807 )
					if( Raw_Money_Flow <= 1.86802e+06 )
						if( Negative_Money_Flow_Sum <= 1.60969e+07 )
							if( Positive_Money_Flow_Sum <= 2.75941e+06 )
								if( Long_MA <= 248.747 )
									ret := 0.042017
								if( Long_MA > 248.747 )
									ret := 0.187161
							if( Positive_Money_Flow_Sum > 2.75941e+06 )
								if( Negative_Money_Flow_Sum <= 8.89125e+06 )
									ret := 0.005146
								if( Negative_Money_Flow_Sum > 8.89125e+06 )
									ret := 0.117729
						if( Negative_Money_Flow_Sum > 1.60969e+07 )
							if( Positive_Money_Flow <= 1.04839e+06 )
								if( Positive_Money_Flow_Sum <= 6.17903e+06 )
									ret := 0.614796
								if( Positive_Money_Flow_Sum > 6.17903e+06 )
									ret := 0.265625
							if( Positive_Money_Flow > 1.04839e+06 )
								if( Long_MA <= 241.094 )
									ret := 0.548387
								if( Long_MA > 241.094 )
									ret := -0.008418
					if( Raw_Money_Flow > 1.86802e+06 )
						if( Negative_Money_Flow_Sum <= 1.8789e+07 )
							if( Positive_Money_Flow_Sum <= 3.3559e+06 )
								if( Negative_Money_Flow_Sum <= 7.33463e+06 )
									ret := -0.052632
								if( Negative_Money_Flow_Sum > 7.33463e+06 )
									ret := 0.466844
							if( Positive_Money_Flow_Sum > 3.3559e+06 )
								if( Positive_Money_Flow_Sum <= 1.16643e+07 )
									ret := -0.054987
								if( Positive_Money_Flow_Sum > 1.16643e+07 )
									ret := 0.386076
						if( Negative_Money_Flow_Sum > 1.8789e+07 )
							if( Negative_Money_Flow_Sum <= 3.8026e+07 )
								if( Negative_Money_Flow_Sum <= 3.22598e+07 )
									ret := 0.372313
								if( Negative_Money_Flow_Sum > 3.22598e+07 )
									ret := 0.633065
							if( Negative_Money_Flow_Sum > 3.8026e+07 )
								if( Positive_Money_Flow_Sum <= 1.49384e+07 )
									ret := 0.369748
								if( Positive_Money_Flow_Sum > 1.49384e+07 )
									ret := -0.093168
				if( Short_MA > 517.807 )
					if( Money_Flow_Ratio <= 0.423172 )
						if( Negative_Money_Flow_Sum <= 3.15562e+07 )
							if( Negative_Money_Flow_Sum <= 7.51015e+06 )
								if( MFI <= 29.1108 )
									ret := -0.007181
								if( MFI > 29.1108 )
									ret := -0.319672
							if( Negative_Money_Flow_Sum > 7.51015e+06 )
								if( Negative_Money_Flow_Sum <= 7.93099e+06 )
									ret := 0.543046
								if( Negative_Money_Flow_Sum > 7.93099e+06 )
									ret := 0.091585
						if( Negative_Money_Flow_Sum > 3.15562e+07 )
							if( Raw_Money_Flow <= 3.35653e+06 )
								if( Typical_Price <= 518.729 )
									ret := 0.769231 // buy
								if( Typical_Price > 518.729 )
									ret := -0.418251
							if( Raw_Money_Flow > 3.35653e+06 )
								if( Positive_Money_Flow_Sum <= 1.18421e+07 )
									ret := -0.229730
								if( Positive_Money_Flow_Sum > 1.18421e+07 )
									ret := 0.312977
					if( Money_Flow_Ratio > 0.423172 )
						if( Negative_Money_Flow <= 1.38195e+06 )
							if( Negative_Money_Flow <= 769006 )
								if( Negative_Money_Flow <= 654316 )
									ret := 0.114849
								if( Negative_Money_Flow > 654316 )
									ret := -0.272727
							if( Negative_Money_Flow > 769006 )
								if( Positive_Money_Flow_Sum <= 4.40178e+06 )
									ret := 0.476190
								if( Positive_Money_Flow_Sum > 4.40178e+06 )
									ret := 0.160000
						if( Negative_Money_Flow > 1.38195e+06 )
							if( Positive_Money_Flow_Sum <= 2.12046e+07 )
								if( Short_Long_Diff <= -2.4788 )
									ret := -0.550459
								if( Short_Long_Diff > -2.4788 )
									ret := -0.083333
							if( Positive_Money_Flow_Sum > 2.12046e+07 )
								if( Raw_Money_Flow <= 3.46386e+06 )
									ret := 0.631579
								if( Raw_Money_Flow > 3.46386e+06 )
									ret := -0.082353
			if( Raw_Money_Flow > 5.31533e+06 )
				if( Negative_Money_Flow <= 6.34356e+06 )
					if( Short_Long_Diff <= -13.2992 )
						if( Positive_Money_Flow <= 5.85256e+06 )
							ret := -0.750000 // sell
						if( Positive_Money_Flow > 5.85256e+06 )
							ret := -1.000000 // sell
					if( Short_Long_Diff > -13.2992 )
						if( Long_MA <= 466.436 )
							if( Money_Flow_Ratio <= 1.23188 )
								if( Negative_Money_Flow_Sum <= 1.57152e+08 )
									ret := 0.626556
								if( Negative_Money_Flow_Sum > 1.57152e+08 )
									ret := -0.875000 // sell
							if( Money_Flow_Ratio > 1.23188 )
								if( Typical_Price <= 341.638 )
									ret := -0.750000 // sell
								if( Typical_Price > 341.638 )
									ret := -1.000000 // sell
						if( Long_MA > 466.436 )
							if( Positive_Money_Flow_Sum <= 1.88521e+07 )
								if( Money_Flow_Ratio <= 0.336697 )
									ret := 0.162393
								if( Money_Flow_Ratio > 0.336697 )
									ret := -0.432099
							if( Positive_Money_Flow_Sum > 1.88521e+07 )
								if( Short_MA <= 558.623 )
									ret := 0.231132
								if( Short_MA > 558.623 )
									ret := 0.753247 // buy
				if( Negative_Money_Flow > 6.34356e+06 )
					if( MFI_High <= -56.1737 )
						if( Short_MA <= 549.607 )
							if( Negative_Money_Flow_Sum <= 1.66735e+08 )
								if( Long_MA <= 230.526 )
									ret := 0.166667
								if( Long_MA > 230.526 )
									ret := 0.809524 // buy
							if( Negative_Money_Flow_Sum > 1.66735e+08 )
								if( Negative_Money_Flow_Sum <= 1.85587e+08 )
									ret := -0.461538
								if( Negative_Money_Flow_Sum > 1.85587e+08 )
									ret := 1.000000 // buy
						if( Short_MA > 549.607 )
							if( MFI <= 7.07626 )
								if( Short_MA <= 576.967 )
									ret := -0.378378
								if( Short_MA > 576.967 )
									ret := 0.555556
							if( MFI > 7.07626 )
								if( Short_Long_Diff <= -4.31638 )
									ret := 0.897959 // buy
								if( Short_Long_Diff > -4.31638 )
									ret := 0.489130
					if( MFI_High > -56.1737 )
						if( Positive_Money_Flow_Sum <= 1.11025e+07 )
							if( Typical_Price <= 565.089 )
								if( Typical_Price <= 487.606 )
									ret := -0.600000
								if( Typical_Price > 487.606 )
									ret := 0.250000
							if( Typical_Price > 565.089 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 1.11025e+07 )
							if( Positive_Money_Flow_Sum <= 4.16065e+07 )
								if( Raw_Money_Flow <= 9.42825e+06 )
									ret := 0.207547
								if( Raw_Money_Flow > 9.42825e+06 )
									ret := 0.603175
							if( Positive_Money_Flow_Sum > 4.16065e+07 )
								if( Positive_Money_Flow_Sum <= 7.00476e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 7.00476e+07 )
									ret := 0.500000
		if( Short_Long_Diff > -0.532219 )
			if( Negative_Money_Flow <= 276313 )
				if( Long_MA <= 326.23 )
					if( Money_Flow_Ratio <= 3.56413 )
						if( Positive_Money_Flow_Sum <= 4.36708e+07 )
							if( Negative_Money_Flow_Sum <= 1.08303e+07 )
								if( Negative_Money_Flow_Sum <= 9.31907e+06 )
									ret := 0.013934
								if( Negative_Money_Flow_Sum > 9.31907e+06 )
									ret := 0.252809
							if( Negative_Money_Flow_Sum > 1.08303e+07 )
								if( Short_MA <= 229.106 )
									ret := 0.340000
								if( Short_MA > 229.106 )
									ret := -0.163059
						if( Positive_Money_Flow_Sum > 4.36708e+07 )
							if( Positive_Money_Flow_Sum <= 8.41866e+07 )
								if( Negative_Money_Flow_Sum <= 2.46266e+07 )
									ret := 0.826923 // buy
								if( Negative_Money_Flow_Sum > 2.46266e+07 )
									ret := 0.211538
							if( Positive_Money_Flow_Sum > 8.41866e+07 )
								ret := -1.000000 // sell
					if( Money_Flow_Ratio > 3.56413 )
						if( Positive_Money_Flow_Sum <= 6.15799e+06 )
							if( Negative_Money_Flow_Sum <= 1.21599e+06 )
								if( Raw_Money_Flow <= 151221 )
									ret := -0.051788
								if( Raw_Money_Flow > 151221 )
									ret := 0.069721
							if( Negative_Money_Flow_Sum > 1.21599e+06 )
								if( Positive_Money_Flow <= 417559 )
									ret := -0.376623
								if( Positive_Money_Flow > 417559 )
									ret := -0.025641
						if( Positive_Money_Flow_Sum > 6.15799e+06 )
							if( Typical_Price <= 298.577 )
								if( Negative_Money_Flow_Sum <= 1.77077e+06 )
									ret := -0.346420
								if( Negative_Money_Flow_Sum > 1.77077e+06 )
									ret := -0.112867
							if( Typical_Price > 298.577 )
								if( Positive_Money_Flow_Sum <= 6.46321e+07 )
									ret := 0.050209
								if( Positive_Money_Flow_Sum > 6.46321e+07 )
									ret := -0.888889 // sell
				if( Long_MA > 326.23 )
					if( Negative_Money_Flow_Sum <= 1.08842e+07 )
						if( Long_MA <= 351.084 )
							if( Raw_Money_Flow <= 3.22802e+06 )
								if( Long_MA <= 348.713 )
									ret := 0.130868
								if( Long_MA > 348.713 )
									ret := 0.402985
							if( Raw_Money_Flow > 3.22802e+06 )
								if( Short_MA <= 336.465 )
									ret := 0.235294
								if( Short_MA > 336.465 )
									ret := 0.704545 // buy
						if( Long_MA > 351.084 )
							if( MFI_Low <= 1.57911 )
								if( Typical_Price <= 436.208 )
									ret := 0.135135
								if( Typical_Price > 436.208 )
									ret := -0.276018
							if( MFI_Low > 1.57911 )
								if( MFI <= 49.1488 )
									ret := 0.088570
								if( MFI > 49.1488 )
									ret := 0.034924
					if( Negative_Money_Flow_Sum > 1.08842e+07 )
						if( Raw_Money_Flow <= 4.77761e+06 )
							if( Raw_Money_Flow <= 557991 )
								if( Positive_Money_Flow_Sum <= 4.30225e+06 )
									ret := -0.750000 // sell
								if( Positive_Money_Flow_Sum > 4.30225e+06 )
									ret := 0.697674
							if( Raw_Money_Flow > 557991 )
								if( Negative_Money_Flow_Sum <= 1.15184e+07 )
									ret := -0.374384
								if( Negative_Money_Flow_Sum > 1.15184e+07 )
									ret := -0.075735
						if( Raw_Money_Flow > 4.77761e+06 )
							if( MFI_Low <= 64.2238 )
								if( MFI <= 67.0418 )
									ret := 0.011236
								if( MFI > 67.0418 )
									ret := 0.389610
							if( MFI_Low > 64.2238 )
								if( Long_MA <= 495.019 )
									ret := -1.000000 // sell
								if( Long_MA > 495.019 )
									ret := -0.500000
			if( Negative_Money_Flow > 276313 )
				if( Long_MA <= 247.215 )
					if( MFI_High <= -46.1262 )
						if( Negative_Money_Flow_Sum <= 4.51245e+06 )
							if( Short_Long_Diff <= -0.218504 )
								if( Money_Flow_Ratio <= 0.49571 )
									ret := 0.081535
								if( Money_Flow_Ratio > 0.49571 )
									ret := 0.800000 // buy
							if( Short_Long_Diff > -0.218504 )
								if( Negative_Money_Flow_Sum <= 2.71197e+06 )
									ret := 0.070122
								if( Negative_Money_Flow_Sum > 2.71197e+06 )
									ret := -0.202206
						if( Negative_Money_Flow_Sum > 4.51245e+06 )
							if( Raw_Money_Flow <= 3.5881e+06 )
								if( Short_Long_Diff <= 0.275397 )
									ret := 0.296429
								if( Short_Long_Diff > 0.275397 )
									ret := -0.500000
							if( Raw_Money_Flow > 3.5881e+06 )
								if( Positive_Money_Flow_Sum <= 1.03829e+06 )
									ret := 0.300000
								if( Positive_Money_Flow_Sum > 1.03829e+06 )
									ret := 0.846154 // buy
					if( MFI_High > -46.1262 )
						if( Positive_Money_Flow_Sum <= 2.07525e+07 )
							if( Positive_Money_Flow_Sum <= 1.33122e+07 )
								if( Money_Flow_Ratio <= 0.692849 )
									ret := -0.112619
								if( Money_Flow_Ratio > 0.692849 )
									ret := -0.000611
							if( Positive_Money_Flow_Sum > 1.33122e+07 )
								if( MFI_High <= -19.8379 )
									ret := -0.088235
								if( MFI_High > -19.8379 )
									ret := 0.360360
						if( Positive_Money_Flow_Sum > 2.07525e+07 )
							if( Positive_Money_Flow_Sum <= 3.05653e+07 )
								if( MFI <= 81.5394 )
									ret := -0.800000 // sell
								if( MFI > 81.5394 )
									ret := 0.250000
							if( Positive_Money_Flow_Sum > 3.05653e+07 )
								if( MFI_Low <= 59.9066 )
									ret := 0.302326
								if( MFI_Low > 59.9066 )
									ret := -0.842105 // sell
				if( Long_MA > 247.215 )
					if( Positive_Money_Flow_Sum <= 1.26609e+07 )
						if( Positive_Money_Flow_Sum <= 1.20554e+07 )
							if( Negative_Money_Flow_Sum <= 1.66779e+07 )
								if( MA_Cross <= 89.9605 )
									ret := 0.103186
								if( MA_Cross > 89.9605 )
									ret := -0.061329
							if( Negative_Money_Flow_Sum > 1.66779e+07 )
								if( Short_MA <= 315.666 )
									ret := 0.392857
								if( Short_MA > 315.666 )
									ret := -0.268571
						if( Positive_Money_Flow_Sum > 1.20554e+07 )
							if( Short_MA <= 580.172 )
								if( Raw_Money_Flow <= 1.91675e+06 )
									ret := 0.349515
								if( Raw_Money_Flow > 1.91675e+06 )
									ret := 0.741935 // buy
							if( Short_MA > 580.172 )
								if( Positive_Money_Flow_Sum <= 1.24555e+07 )
									ret := -0.714286 // sell
								if( Positive_Money_Flow_Sum > 1.24555e+07 )
									ret := 0.000000
					if( Positive_Money_Flow_Sum > 1.26609e+07 )
						if( Positive_Money_Flow_Sum <= 2.43779e+07 )
							if( Positive_Money_Flow_Sum <= 2.32363e+07 )
								if( Long_MA <= 250.585 )
									ret := 0.818182 // buy
								if( Long_MA > 250.585 )
									ret := -0.016107
							if( Positive_Money_Flow_Sum > 2.32363e+07 )
								if( MFI_Low <= 37.4702 )
									ret := 0.327273
								if( MFI_Low > 37.4702 )
									ret := -0.621429
						if( Positive_Money_Flow_Sum > 2.43779e+07 )
							if( Long_MA <= 253.474 )
								if( Money_Flow_Ratio <= 2.47991 )
									ret := -0.133333
								if( Money_Flow_Ratio > 2.47991 )
									ret := -1.000000 // sell
							if( Long_MA > 253.474 )
								if( Money_Flow_Ratio <= 1.20261 )
									ret := -0.073469
								if( Money_Flow_Ratio > 1.20261 )
									ret := 0.209604
	if( Typical_Price > 583.076 )
		if( Negative_Money_Flow_Sum <= 2.66265e+07 )
			if( Negative_Money_Flow_Sum <= 1.03064e+07 )
				if( MFI_High <= -4.40993 )
					if( Negative_Money_Flow <= 2.36283e+06 )
						if( Positive_Money_Flow_Sum <= 1.87158e+06 )
							if( Negative_Money_Flow_Sum <= 7.36408e+06 )
								if( Short_Long_Diff <= -0.952679 )
									ret := -0.211470
								if( Short_Long_Diff > -0.952679 )
									ret := -0.053887
							if( Negative_Money_Flow_Sum > 7.36408e+06 )
								if( Negative_Money_Flow <= 1.80638e+06 )
									ret := 0.288889
								if( Negative_Money_Flow > 1.80638e+06 )
									ret := -0.421053
						if( Positive_Money_Flow_Sum > 1.87158e+06 )
							if( Positive_Money_Flow_Sum <= 1.16281e+07 )
								if( Positive_Money_Flow_Sum <= 5.35989e+06 )
									ret := -0.016667
								if( Positive_Money_Flow_Sum > 5.35989e+06 )
									ret := 0.059731
							if( Positive_Money_Flow_Sum > 1.16281e+07 )
								if( Short_Long_Diff <= 0.016153 )
									ret := 0.223404
								if( Short_Long_Diff > 0.016153 )
									ret := -0.143488
					if( Negative_Money_Flow > 2.36283e+06 )
						if( Typical_Price <= 622.055 )
							if( Money_Flow_Ratio <= 2.37956 )
								if( Money_Flow_Ratio <= 1.62248 )
									ret := 0.160920
								if( Money_Flow_Ratio > 1.62248 )
									ret := -0.533333
							if( Money_Flow_Ratio > 2.37956 )
								if( Positive_Money_Flow_Sum <= 1.99831e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 1.99831e+07 )
									ret := -0.166667
						if( Typical_Price > 622.055 )
							if( MFI_Low <= 48.5387 )
								if( Positive_Money_Flow_Sum <= 3.99735e+06 )
									ret := 0.400000
								if( Positive_Money_Flow_Sum > 3.99735e+06 )
									ret := 0.954545 // buy
							if( MFI_Low > 48.5387 )
								ret := -0.500000
				if( MFI_High > -4.40993 )
					if( Positive_Money_Flow_Sum <= 1.82741e+07 )
						if( Negative_Money_Flow_Sum <= 2.89989e+06 )
							if( Positive_Money_Flow_Sum <= 1.14021e+07 )
								if( Money_Flow_Ratio <= 11.6445 )
									ret := -0.099659
								if( Money_Flow_Ratio > 11.6445 )
									ret := 0.407407
							if( Positive_Money_Flow_Sum > 1.14021e+07 )
								if( Money_Flow_Ratio <= 5.37999 )
									ret := 0.081081
								if( Money_Flow_Ratio > 5.37999 )
									ret := -0.641791
						if( Negative_Money_Flow_Sum > 2.89989e+06 )
							if( Negative_Money_Flow_Sum <= 4.84879e+06 )
								if( Raw_Money_Flow <= 1.32858e+06 )
									ret := -0.333333
								if( Raw_Money_Flow > 1.32858e+06 )
									ret := -0.681818
							if( Negative_Money_Flow_Sum > 4.84879e+06 )
								if( Raw_Money_Flow <= 1.92938e+06 )
									ret := 0.280000
								if( Raw_Money_Flow > 1.92938e+06 )
									ret := -0.571429
					if( Positive_Money_Flow_Sum > 1.82741e+07 )
						if( Negative_Money_Flow_Sum <= 2.24533e+06 )
							if( Positive_Money_Flow_Sum <= 2.0635e+07 )
								if( Positive_Money_Flow <= 2.27498e+06 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow > 2.27498e+06 )
									ret := 0.750000 // buy
							if( Positive_Money_Flow_Sum > 2.0635e+07 )
								if( Positive_Money_Flow <= 8.92916e+06 )
									ret := 0.239130
								if( Positive_Money_Flow > 8.92916e+06 )
									ret := 0.909091 // buy
						if( Negative_Money_Flow_Sum > 2.24533e+06 )
							if( Positive_Money_Flow_Sum <= 3.82529e+07 )
								if( Positive_Money_Flow_Sum <= 3.41693e+07 )
									ret := 0.047809
								if( Positive_Money_Flow_Sum > 3.41693e+07 )
									ret := -0.700000 // sell
							if( Positive_Money_Flow_Sum > 3.82529e+07 )
								if( Negative_Money_Flow_Sum <= 5.81741e+06 )
									ret := -0.210526
								if( Negative_Money_Flow_Sum > 5.81741e+06 )
									ret := 0.492308
			if( Negative_Money_Flow_Sum > 1.03064e+07 )
				if( Money_Flow_Ratio <= 1.21348 )
					if( Positive_Money_Flow <= 2.98718e+06 )
						if( Raw_Money_Flow <= 3.42065e+06 )
							if( Long_MA <= 589.443 )
								if( Positive_Money_Flow <= 1.67639e+06 )
									ret := -0.203390
								if( Positive_Money_Flow > 1.67639e+06 )
									ret := 0.375000
							if( Long_MA > 589.443 )
								if( Short_MA <= 705.517 )
									ret := 0.119446
								if( Short_MA > 705.517 )
									ret := -0.666667
						if( Raw_Money_Flow > 3.42065e+06 )
							if( Negative_Money_Flow <= 1.10974e+07 )
								if( MFI_High <= -28.0703 )
									ret := -0.300613
								if( MFI_High > -28.0703 )
									ret := 0.833333 // buy
							if( Negative_Money_Flow > 1.10974e+07 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow > 2.98718e+06 )
						if( Negative_Money_Flow_Sum <= 1.60516e+07 )
							if( Typical_Price <= 589.191 )
								ret := -0.750000 // sell
							if( Typical_Price > 589.191 )
								if( Long_MA <= 604.704 )
									ret := 0.000000
								if( Long_MA > 604.704 )
									ret := 0.600000
						if( Negative_Money_Flow_Sum > 1.60516e+07 )
							if( Positive_Money_Flow <= 5.11567e+06 )
								if( Long_MA <= 590.26 )
									ret := -0.357143
								if( Long_MA > 590.26 )
									ret := -0.937500 // sell
							if( Positive_Money_Flow > 5.11567e+06 )
								ret := 0.285714
				if( Money_Flow_Ratio > 1.21348 )
					if( MFI <= 59.2547 )
						if( Positive_Money_Flow_Sum <= 2.2424e+07 )
							if( Long_MA <= 641.306 )
								if( Short_Long_Diff <= 0.253968 )
									ret := 0.714286 // buy
								if( Short_Long_Diff > 0.253968 )
									ret := 0.405405
							if( Long_MA > 641.306 )
								if( Short_MA <= 700.1 )
									ret := 1.000000 // buy
								if( Short_MA > 700.1 )
									ret := 0.800000 // buy
						if( Positive_Money_Flow_Sum > 2.2424e+07 )
							if( Positive_Money_Flow_Sum <= 2.7339e+07 )
								if( Short_Long_Diff <= 0.354115 )
									ret := 0.428571
								if( Short_Long_Diff > 0.354115 )
									ret := -0.678571
							if( Positive_Money_Flow_Sum > 2.7339e+07 )
								if( Positive_Money_Flow_Sum <= 3.19565e+07 )
									ret := 0.529412
								if( Positive_Money_Flow_Sum > 3.19565e+07 )
									ret := 1.000000 // buy
					if( MFI > 59.2547 )
						if( Short_Long_Diff <= 12.3268 )
							if( Money_Flow_Ratio <= 8.07578 )
								if( Raw_Money_Flow <= 1.84641e+07 )
									ret := 0.127175
								if( Raw_Money_Flow > 1.84641e+07 )
									ret := -0.916667 // sell
							if( Money_Flow_Ratio > 8.07578 )
								ret := 1.000000 // buy
						if( Short_Long_Diff > 12.3268 )
							ret := -1.000000 // sell
		if( Negative_Money_Flow_Sum > 2.66265e+07 )
			if( MFI_Low <= 20.4726 )
				if( Raw_Money_Flow <= 5.84885e+06 )
					if( Positive_Money_Flow_Sum <= 1.99062e+07 )
						if( Positive_Money_Flow_Sum <= 8.59132e+06 )
							if( Raw_Money_Flow <= 2.02192e+06 )
								if( Long_MA <= 603.702 )
									ret := -0.214286
								if( Long_MA > 603.702 )
									ret := -0.865385 // sell
							if( Raw_Money_Flow > 2.02192e+06 )
								if( Short_Long_Diff <= -2.34276 )
									ret := -0.163636
								if( Short_Long_Diff > -2.34276 )
									ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 8.59132e+06 )
							if( Short_Long_Diff <= -3.54814 )
								if( Long_MA <= 592.965 )
									ret := -0.666667
								if( Long_MA > 592.965 )
									ret := 0.600000
							if( Short_Long_Diff > -3.54814 )
								if( Raw_Money_Flow <= 2.24326e+06 )
									ret := 0.396226
								if( Raw_Money_Flow > 2.24326e+06 )
									ret := -0.355769
					if( Positive_Money_Flow_Sum > 1.99062e+07 )
						if( Long_MA <= 622.903 )
							if( MFI_High <= -41.271 )
								if( Negative_Money_Flow_Sum <= 7.64007e+07 )
									ret := -0.590476
								if( Negative_Money_Flow_Sum > 7.64007e+07 )
									ret := -1.000000 // sell
							if( MFI_High > -41.271 )
								if( Negative_Money_Flow <= 4.15641e+06 )
									ret := -0.736842 // sell
								if( Negative_Money_Flow > 4.15641e+06 )
									ret := 0.538462
						if( Long_MA > 622.903 )
							if( Raw_Money_Flow <= 3.38315e+06 )
								if( Positive_Money_Flow <= 2.32616e+06 )
									ret := 0.166667
								if( Positive_Money_Flow > 2.32616e+06 )
									ret := -0.750000 // sell
							if( Raw_Money_Flow > 3.38315e+06 )
								if( MFI_High <= -48.9111 )
									ret := 0.750000 // buy
								if( MFI_High > -48.9111 )
									ret := 0.333333
				if( Raw_Money_Flow > 5.84885e+06 )
					if( Negative_Money_Flow_Sum <= 4.66331e+07 )
						if( Positive_Money_Flow_Sum <= 5.70075e+06 )
							if( MFI_High <= -71.0571 )
								ret := -0.500000
							if( MFI_High > -71.0571 )
								ret := 0.571429
						if( Positive_Money_Flow_Sum > 5.70075e+06 )
							if( MFI_Low <= -5.27972 )
								ret := -1.000000 // sell
							if( MFI_Low > -5.27972 )
								if( MFI_Low <= 10.0554 )
									ret := 0.000000
								if( MFI_Low > 10.0554 )
									ret := -0.571429
					if( Negative_Money_Flow_Sum > 4.66331e+07 )
						if( Negative_Money_Flow_Sum <= 6.36336e+07 )
							if( Negative_Money_Flow_Sum <= 4.82168e+07 )
								ret := 0.200000
							if( Negative_Money_Flow_Sum > 4.82168e+07 )
								if( Long_MA <= 632.964 )
									ret := 0.925926 // buy
								if( Long_MA > 632.964 )
									ret := 0.500000
						if( Negative_Money_Flow_Sum > 6.36336e+07 )
							if( Positive_Money_Flow_Sum <= 7.61896e+06 )
								if( Negative_Money_Flow <= 1.25302e+07 )
									ret := -0.777778 // sell
								if( Negative_Money_Flow > 1.25302e+07 )
									ret := 0.454545
							if( Positive_Money_Flow_Sum > 7.61896e+06 )
								if( Long_MA <= 593.524 )
									ret := -0.090909
								if( Long_MA > 593.524 )
									ret := 0.634146
			if( MFI_Low > 20.4726 )
				if( Positive_Money_Flow_Sum <= 5.15112e+07 )
					if( Typical_Price <= 600.648 )
						if( Raw_Money_Flow <= 5.06209e+06 )
							if( MFI_Low <= 33.0569 )
								if( Short_Long_Diff <= -0.887593 )
									ret := -0.441176
								if( Short_Long_Diff > -0.887593 )
									ret := -0.891304 // sell
							if( MFI_Low > 33.0569 )
								if( MFI <= 56.9957 )
									ret := 0.666667
								if( MFI > 56.9957 )
									ret := -1.000000 // sell
						if( Raw_Money_Flow > 5.06209e+06 )
							if( Positive_Money_Flow_Sum <= 3.36506e+07 )
								ret := 0.857143 // buy
							if( Positive_Money_Flow_Sum > 3.36506e+07 )
								if( Negative_Money_Flow <= 6.27157e+06 )
									ret := -0.193548
								if( Negative_Money_Flow > 6.27157e+06 )
									ret := -0.875000 // sell
					if( Typical_Price > 600.648 )
						if( Positive_Money_Flow_Sum <= 2.23007e+07 )
							if( MFI <= 41.2134 )
								ret := -0.500000
							if( MFI > 41.2134 )
								ret := 0.166667
						if( Positive_Money_Flow_Sum > 2.23007e+07 )
							if( Short_MA <= 619.517 )
								if( Long_MA <= 610.185 )
									ret := -0.982143 // sell
								if( Long_MA > 610.185 )
									ret := -0.833333 // sell
							if( Short_MA > 619.517 )
								if( Short_Long_Diff <= 2.61312 )
									ret := -0.333333
								if( Short_Long_Diff > 2.61312 )
									ret := -0.928571 // sell
				if( Positive_Money_Flow_Sum > 5.15112e+07 )
					if( Long_MA <= 617.086 )
						if( Negative_Money_Flow_Sum <= 5.9141e+07 )
							if( Raw_Money_Flow <= 5.8351e+06 )
								if( Short_Long_Diff <= 4.33408 )
									ret := 0.166667
								if( Short_Long_Diff > 4.33408 )
									ret := 0.869565 // buy
							if( Raw_Money_Flow > 5.8351e+06 )
								if( Short_Long_Diff <= 6.65429 )
									ret := -0.456140
								if( Short_Long_Diff > 6.65429 )
									ret := 0.533333
						if( Negative_Money_Flow_Sum > 5.9141e+07 )
							if( Negative_Money_Flow <= 5.0669e+06 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow > 5.0669e+06 )
								ret := 0.000000
					if( Long_MA > 617.086 )
						if( Typical_Price <= 619.48 )
							ret := 0.250000
						if( Typical_Price > 619.48 )
							if( Long_MA <= 619.882 )
								ret := -1.000000 // sell
							if( Long_MA > 619.882 )
								if( Raw_Money_Flow <= 2.15165e+06 )
									ret := -0.272727
								if( Raw_Money_Flow > 2.15165e+06 )
									ret := -0.825000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_MA_Cross_SMA 
//@version=5
//indicator title="MA Cross", overlay=true)

shortlen = input.int(9, title="Short MA Length", minval=1)
longlen = input.int(21, title="Long MA Length", minval=1)

// Calculate the short and long simple moving averages (SMA)
Short_MA = ta.sma(close, shortlen)
Long_MA = ta.sma(close, longlen)

// Calculate the difference between short MA and long MA
Short_Long_Diff = Short_MA - Long_MA

// Identify crossover points where short MA crosses above or below the long MA
MA_Cross = ta.valuewhen(ta.crossover(Short_MA, Long_MA), Short_MA, 0)

// Plot the results
plot(Short_MA, color=color.orange, title="Short MA")
plot(Long_MA, color=color.green, title="Long MA")
plotshape(na(MA_Cross) ? na : MA_Cross, style=shape.cross, location=location.absolute, color=color.blue, title="Cross")


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
float op_operation = decision_tree_0_BNBUSDT_5Min_a6e79807(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


