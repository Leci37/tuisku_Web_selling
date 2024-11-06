//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: TWLO_15Min_2MT0_f85f0a6c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TWLO_15Min_2MT0_f85f0a6c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TWLO_15Min_f85f0a6c(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 1.25164 )
		if( Raw_Money_Flow <= 1.64773e+06 )
			if( ema12 <= -0.051752 )
				if( Positive_Money_Flow_Sum <= 1.5926e+06 )
					if( Positive_Money_Flow_Sum <= 865891 )
						if( ema12 <= -0.146487 )
							if( Money_Flow_Ratio <= 1.12001 )
								if( Negative_Money_Flow_Sum <= 422005 )
									ret := -0.625000
								if( Negative_Money_Flow_Sum > 422005 )
									ret := 0.260054
							if( Money_Flow_Ratio > 1.12001 )
								if( Negative_Money_Flow_Sum <= 272758 )
									ret := 0.470588
								if( Negative_Money_Flow_Sum > 272758 )
									ret := -0.344828
						if( ema12 > -0.146487 )
							if( Negative_Money_Flow_Sum <= 3.92712e+07 )
								if( ema13 <= -0.165874 )
									ret := -0.347107
								if( ema13 > -0.165874 )
									ret := 0.032787
							if( Negative_Money_Flow_Sum > 3.92712e+07 )
								if( ema3 <= 60.5953 )
									ret := 1.000000 // buy
								if( ema3 > 60.5953 )
									ret := 0.192308
					if( Positive_Money_Flow_Sum > 865891 )
						if( ema1 <= 99.4705 )
							if( ema13 <= -0.152611 )
								if( Positive_Money_Flow <= 124646 )
									ret := 0.488889
								if( Positive_Money_Flow > 124646 )
									ret := 0.770115 // buy
							if( ema13 > -0.152611 )
								if( MFI_Low <= 46.471 )
									ret := -0.454545
								if( MFI_Low > 46.471 )
									ret := 0.800000 // buy
						if( ema1 > 99.4705 )
							if( ema13 <= -0.966694 )
								if( Money_Flow_Ratio <= 2.76764 )
									ret := 0.532258
								if( Money_Flow_Ratio > 2.76764 )
									ret := -1.000000 // sell
							if( ema13 > -0.966694 )
								if( MFI_High <= -15.3887 )
									ret := -0.010989
								if( MFI_High > -15.3887 )
									ret := 0.636364
				if( Positive_Money_Flow_Sum > 1.5926e+06 )
					if( ema13 <= -1.05477 )
						if( tema <= 62.6621 )
							if( tema <= 39.5573 )
								ret := 0.250000
							if( tema > 39.5573 )
								if( Raw_Money_Flow <= 68308.1 )
									ret := -0.400000
								if( Raw_Money_Flow > 68308.1 )
									ret := -0.931034 // sell
						if( tema > 62.6621 )
							if( ema13 <= -1.14517 )
								if( ema1 <= 377.911 )
									ret := -0.096552
								if( ema1 > 377.911 )
									ret := -0.500000
							if( ema13 > -1.14517 )
								if( Positive_Money_Flow <= 587903 )
									ret := -0.348837
								if( Positive_Money_Flow > 587903 )
									ret := -1.000000 // sell
					if( ema13 > -1.05477 )
						if( Positive_Money_Flow_Sum <= 4.34993e+06 )
							if( Positive_Money_Flow <= 1.12867e+06 )
								if( MFI_Low <= -4.82181 )
									ret := 0.192308
								if( MFI_Low > -4.82181 )
									ret := -0.295918
							if( Positive_Money_Flow > 1.12867e+06 )
								if( ema1 <= 211.557 )
									ret := 0.552632
								if( ema1 > 211.557 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 4.34993e+06 )
							if( Positive_Money_Flow_Sum <= 6.93773e+06 )
								if( Negative_Money_Flow_Sum <= 2.42635e+07 )
									ret := 0.088050
								if( Negative_Money_Flow_Sum > 2.42635e+07 )
									ret := 0.538462
							if( Positive_Money_Flow_Sum > 6.93773e+06 )
								if( MFI_High <= -35.0191 )
									ret := -0.012081
								if( MFI_High > -35.0191 )
									ret := 0.100543
			if( ema12 > -0.051752 )
				if( tema <= 28.9531 )
					if( ema2 <= 28.7257 )
						if( Typical_Price <= 28.6683 )
							if( Positive_Money_Flow <= 5041.23 )
								if( Typical_Price <= 28.01 )
									ret := 0.113043
								if( Typical_Price > 28.01 )
									ret := 0.593750
							if( Positive_Money_Flow > 5041.23 )
								if( ema2 <= 24.3098 )
									ret := 0.260870
								if( ema2 > 24.3098 )
									ret := 0.021519
						if( Typical_Price > 28.6683 )
							if( tema <= 28.7112 )
								if( MFI_High <= -46.0753 )
									ret := -0.250000
								if( MFI_High > -46.0753 )
									ret := -0.833333 // sell
							if( tema > 28.7112 )
								if( ema2 <= 28.529 )
									ret := 0.600000
								if( ema2 > 28.529 )
									ret := -0.285714
					if( ema2 > 28.7257 )
						if( ema3 <= 28.8152 )
							if( Negative_Money_Flow_Sum <= 6.61141e+06 )
								if( Typical_Price <= 28.8483 )
									ret := 0.000000
								if( Typical_Price > 28.8483 )
									ret := 0.250000
							if( Negative_Money_Flow_Sum > 6.61141e+06 )
								if( Money_Flow_Ratio <= 1.34536 )
									ret := 0.937500 // buy
								if( Money_Flow_Ratio > 1.34536 )
									ret := 0.500000
						if( ema3 > 28.8152 )
							if( ema1 <= 28.9217 )
								if( Positive_Money_Flow_Sum <= 1.11239e+07 )
									ret := -0.103448
								if( Positive_Money_Flow_Sum > 1.11239e+07 )
									ret := 0.600000
							if( ema1 > 28.9217 )
								if( Raw_Money_Flow <= 54230.9 )
									ret := 0.750000 // buy
								if( Raw_Money_Flow > 54230.9 )
									ret := 0.500000
				if( tema > 28.9531 )
					if( Money_Flow_Ratio <= 1.43085 )
						if( Positive_Money_Flow_Sum <= 7.26946e+07 )
							if( Positive_Money_Flow <= 116450 )
								if( MFI <= 0.364712 )
									ret := 0.263158
								if( MFI > 0.364712 )
									ret := -0.174676
							if( Positive_Money_Flow > 116450 )
								if( Positive_Money_Flow_Sum <= 837267 )
									ret := -0.295000
								if( Positive_Money_Flow_Sum > 837267 )
									ret := -0.044718
						if( Positive_Money_Flow_Sum > 7.26946e+07 )
							if( ema1 <= 239.866 )
								if( MFI_Low <= 36.8513 )
									ret := -0.028409
								if( MFI_Low > 36.8513 )
									ret := -0.533333
							if( ema1 > 239.866 )
								if( Typical_Price <= 395.58 )
									ret := 0.208633
								if( Typical_Price > 395.58 )
									ret := -0.333333
					if( Money_Flow_Ratio > 1.43085 )
						if( Positive_Money_Flow_Sum <= 2.13674e+08 )
							if( ema1 <= 150.159 )
								if( ema3 <= 65.8294 )
									ret := 0.003053
								if( ema3 > 65.8294 )
									ret := -0.083877
							if( ema1 > 150.159 )
								if( Positive_Money_Flow_Sum <= 2.08759e+06 )
									ret := 0.630137
								if( Positive_Money_Flow_Sum > 2.08759e+06 )
									ret := 0.031148
						if( Positive_Money_Flow_Sum > 2.13674e+08 )
							if( Positive_Money_Flow <= 440984 )
								if( Negative_Money_Flow_Sum <= 953984 )
									ret := 0.347826
								if( Negative_Money_Flow_Sum > 953984 )
									ret := -0.163399
							if( Positive_Money_Flow > 440984 )
								if( Negative_Money_Flow_Sum <= 6.17797e+07 )
									ret := -0.785714 // sell
								if( Negative_Money_Flow_Sum > 6.17797e+07 )
									ret := -0.291667
		if( Raw_Money_Flow > 1.64773e+06 )
			if( tema <= 97.5523 )
				if( Positive_Money_Flow_Sum <= 1.8166e+08 )
					if( Money_Flow_Ratio <= 29.9888 )
						if( Negative_Money_Flow_Sum <= 8.05225e+06 )
							if( Raw_Money_Flow <= 3.14571e+07 )
								if( Raw_Money_Flow <= 2.19304e+07 )
									ret := -0.034916
								if( Raw_Money_Flow > 2.19304e+07 )
									ret := -0.604167
							if( Raw_Money_Flow > 3.14571e+07 )
								if( MFI_Low <= 76.1198 )
									ret := 0.821429 // buy
								if( MFI_Low > 76.1198 )
									ret := -0.400000
						if( Negative_Money_Flow_Sum > 8.05225e+06 )
							if( ema13 <= -0.896846 )
								if( Negative_Money_Flow_Sum <= 6.49843e+07 )
									ret := 0.419142
								if( Negative_Money_Flow_Sum > 6.49843e+07 )
									ret := 0.021782
							if( ema13 > -0.896846 )
								if( ema3 <= 57.0037 )
									ret := 0.102324
								if( ema3 > 57.0037 )
									ret := 0.027659
					if( Money_Flow_Ratio > 29.9888 )
						if( ema12 <= 0.286582 )
							if( Positive_Money_Flow_Sum <= 1.62342e+07 )
								if( Raw_Money_Flow <= 1.23024e+07 )
									ret := 0.203125
								if( Raw_Money_Flow > 1.23024e+07 )
									ret := -0.636364
							if( Positive_Money_Flow_Sum > 1.62342e+07 )
								if( ema1 <= 60.2198 )
									ret := 0.642384
								if( ema1 > 60.2198 )
									ret := 0.219048
						if( ema12 > 0.286582 )
							if( Money_Flow_Ratio <= 426.047 )
								if( Positive_Money_Flow <= 3.311e+07 )
									ret := 0.056548
								if( Positive_Money_Flow > 3.311e+07 )
									ret := 0.490909
							if( Money_Flow_Ratio > 426.047 )
								if( MFI_High <= 19.7669 )
									ret := -1.000000 // sell
								if( MFI_High > 19.7669 )
									ret := -0.357143
				if( Positive_Money_Flow_Sum > 1.8166e+08 )
					if( MFI_High <= 7.79917 )
						if( ema13 <= 2.28229 )
							if( MFI_Low <= 49.6147 )
								if( Negative_Money_Flow_Sum <= 2.69211e+08 )
									ret := -0.118644
								if( Negative_Money_Flow_Sum > 2.69211e+08 )
									ret := 0.622222
							if( MFI_Low > 49.6147 )
								if( tema <= 91.1491 )
									ret := 0.722628 // buy
								if( tema > 91.1491 )
									ret := 0.241379
						if( ema13 > 2.28229 )
							if( Typical_Price <= 67.5697 )
								if( tema <= 52.9758 )
									ret := -0.166667
								if( tema > 52.9758 )
									ret := -1.000000 // sell
							if( Typical_Price > 67.5697 )
								if( Positive_Money_Flow_Sum <= 2.82475e+08 )
									ret := 0.437500
								if( Positive_Money_Flow_Sum > 2.82475e+08 )
									ret := -0.500000
					if( MFI_High > 7.79917 )
						if( Typical_Price <= 66.5767 )
							if( tema <= 55.6386 )
								if( ema2 <= 47.1261 )
									ret := -0.500000
								if( ema2 > 47.1261 )
									ret := 0.000000
							if( tema > 55.6386 )
								if( Negative_Money_Flow_Sum <= 2.50872e+07 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 2.50872e+07 )
									ret := -0.750000 // sell
						if( Typical_Price > 66.5767 )
							if( Positive_Money_Flow <= 9.12301e+07 )
								if( ema3 <= 72.9991 )
									ret := 0.555556
								if( ema3 > 72.9991 )
									ret := -0.181818
							if( Positive_Money_Flow > 9.12301e+07 )
								ret := 1.000000 // buy
			if( tema > 97.5523 )
				if( MFI_Low <= 7.18635 )
					if( ema13 <= -3.57676 )
						if( ema13 <= -6.93313 )
							if( Negative_Money_Flow_Sum <= 7.15607e+08 )
								if( MFI <= 7.35068 )
									ret := -0.200000
								if( MFI > 7.35068 )
									ret := 0.651515
							if( Negative_Money_Flow_Sum > 7.15607e+08 )
								ret := -0.500000
						if( ema13 > -6.93313 )
							if( ema12 <= -3.01209 )
								if( Positive_Money_Flow_Sum <= 6.62098e+07 )
									ret := -0.342105
								if( Positive_Money_Flow_Sum > 6.62098e+07 )
									ret := 0.458333
							if( ema12 > -3.01209 )
								if( Negative_Money_Flow_Sum <= 4.90473e+08 )
									ret := 0.400000
								if( Negative_Money_Flow_Sum > 4.90473e+08 )
									ret := -0.222222
					if( ema13 > -3.57676 )
						if( Positive_Money_Flow_Sum <= 9.48392e+06 )
							if( ema3 <= 111.139 )
								ret := -0.166667
							if( ema3 > 111.139 )
								if( Negative_Money_Flow_Sum <= 6.44092e+07 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 6.44092e+07 )
									ret := -0.500000
						if( Positive_Money_Flow_Sum > 9.48392e+06 )
							if( Raw_Money_Flow <= 5.36756e+07 )
								if( Negative_Money_Flow_Sum <= 4.46647e+08 )
									ret := 0.125855
								if( Negative_Money_Flow_Sum > 4.46647e+08 )
									ret := -0.342857
							if( Raw_Money_Flow > 5.36756e+07 )
								if( ema12 <= -0.842442 )
									ret := -1.000000 // sell
								if( ema12 > -0.842442 )
									ret := 0.250000
				if( MFI_Low > 7.18635 )
					if( MFI <= 93.5234 )
						if( Positive_Money_Flow_Sum <= 2.38747e+07 )
							if( ema2 <= 168.213 )
								if( Raw_Money_Flow <= 3.89056e+06 )
									ret := -0.621951
								if( Raw_Money_Flow > 3.89056e+06 )
									ret := -0.276316
							if( ema2 > 168.213 )
								if( ema1 <= 185.5 )
									ret := 0.769231 // buy
								if( ema1 > 185.5 )
									ret := -0.253165
						if( Positive_Money_Flow_Sum > 2.38747e+07 )
							if( Negative_Money_Flow_Sum <= 6.40781e+08 )
								if( Positive_Money_Flow_Sum <= 2.69826e+07 )
									ret := 0.409836
								if( Positive_Money_Flow_Sum > 2.69826e+07 )
									ret := -0.017301
							if( Negative_Money_Flow_Sum > 6.40781e+08 )
								if( Raw_Money_Flow <= 3.27115e+07 )
									ret := 0.000000
								if( Raw_Money_Flow > 3.27115e+07 )
									ret := -0.837209 // sell
					if( MFI > 93.5234 )
						if( Money_Flow_Ratio <= 84.9731 )
							if( tema <= 114.892 )
								if( Money_Flow_Ratio <= 42.8788 )
									ret := 0.268657
								if( Money_Flow_Ratio > 42.8788 )
									ret := 0.623529
							if( tema > 114.892 )
								if( Raw_Money_Flow <= 4.0646e+07 )
									ret := -0.017621
								if( Raw_Money_Flow > 4.0646e+07 )
									ret := 0.379310
						if( Money_Flow_Ratio > 84.9731 )
							if( Raw_Money_Flow <= 8.12837e+07 )
								if( Money_Flow_Ratio <= 135.874 )
									ret := -0.250000
								if( Money_Flow_Ratio > 135.874 )
									ret := 0.165242
							if( Raw_Money_Flow > 8.12837e+07 )
								if( Raw_Money_Flow <= 1.28925e+08 )
									ret := -0.682540
								if( Raw_Money_Flow > 1.28925e+08 )
									ret := 0.636364
	if( Negative_Money_Flow > 1.25164 )
		if( Negative_Money_Flow <= 527828 )
			if( ema12 <= -0.146393 )
				if( Positive_Money_Flow_Sum <= 4.2254e+07 )
					if( Negative_Money_Flow_Sum <= 2.16515e+08 )
						if( Positive_Money_Flow_Sum <= 3.07326e+07 )
							if( ema2 <= 107.689 )
								if( ema2 <= 25.2661 )
									ret := -0.588235
								if( ema2 > 25.2661 )
									ret := 0.383024
							if( ema2 > 107.689 )
								if( ema12 <= -1.82781 )
									ret := 0.846154 // buy
								if( ema12 > -1.82781 )
									ret := 0.159817
						if( Positive_Money_Flow_Sum > 3.07326e+07 )
							if( ema13 <= -0.338856 )
								if( Typical_Price <= 65.7007 )
									ret := -0.148148
								if( Typical_Price > 65.7007 )
									ret := 0.541528
							if( ema13 > -0.338856 )
								if( Negative_Money_Flow_Sum <= 9.20256e+07 )
									ret := 0.810127 // buy
								if( Negative_Money_Flow_Sum > 9.20256e+07 )
									ret := 0.181818
					if( Negative_Money_Flow_Sum > 2.16515e+08 )
						if( Positive_Money_Flow_Sum <= 4.94821e+06 )
							if( Negative_Money_Flow <= 31369 )
								if( Negative_Money_Flow_Sum <= 2.4646e+08 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 2.4646e+08 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow > 31369 )
								if( ema13 <= -1.69138 )
									ret := -0.909091 // sell
								if( ema13 > -1.69138 )
									ret := -0.428571
						if( Positive_Money_Flow_Sum > 4.94821e+06 )
							if( Positive_Money_Flow <= 99394.4 )
								if( Negative_Money_Flow <= 40864.2 )
									ret := -0.600000
								if( Negative_Money_Flow > 40864.2 )
									ret := 0.125000
							if( Positive_Money_Flow > 99394.4 )
								if( ema3 <= 268.654 )
									ret := 1.000000 // buy
								if( ema3 > 268.654 )
									ret := 0.500000
				if( Positive_Money_Flow_Sum > 4.2254e+07 )
					if( Positive_Money_Flow_Sum <= 2.35685e+08 )
						if( ema3 <= 70.9223 )
							if( Negative_Money_Flow_Sum <= 2.47212e+07 )
								if( MFI_Low <= 78.9528 )
									ret := 0.895833 // buy
								if( MFI_Low > 78.9528 )
									ret := -0.400000
							if( Negative_Money_Flow_Sum > 2.47212e+07 )
								if( MFI <= 70.3817 )
									ret := 0.264151
								if( MFI > 70.3817 )
									ret := -1.000000 // sell
						if( ema3 > 70.9223 )
							if( Raw_Money_Flow <= 23262.4 )
								if( ema12 <= -0.282262 )
									ret := -0.468750
								if( ema12 > -0.282262 )
									ret := 0.032787
							if( Raw_Money_Flow > 23262.4 )
								if( ema13 <= -1.65301 )
									ret := -0.002703
								if( ema13 > -1.65301 )
									ret := 0.184064
					if( Positive_Money_Flow_Sum > 2.35685e+08 )
						if( Typical_Price <= 140.897 )
							if( ema3 <= 133.296 )
								ret := 0.000000
							if( ema3 > 133.296 )
								ret := -0.250000
						if( Typical_Price > 140.897 )
							if( MFI_Low <= 32.2829 )
								if( Typical_Price <= 288.897 )
									ret := 0.000000
								if( Typical_Price > 288.897 )
									ret := 0.500000
							if( MFI_Low > 32.2829 )
								if( Positive_Money_Flow_Sum <= 4.0519e+08 )
									ret := 0.903226 // buy
								if( Positive_Money_Flow_Sum > 4.0519e+08 )
									ret := 0.384615
			if( ema12 > -0.146393 )
				if( MFI <= 59.9734 )
					if( ema12 <= 0.012071 )
						if( ema13 <= -0.56313 )
							if( MFI <= 4.88387 )
								if( Raw_Money_Flow <= 148323 )
									ret := -0.200000
								if( Raw_Money_Flow > 148323 )
									ret := 0.600000
							if( MFI > 4.88387 )
								if( Negative_Money_Flow <= 125184 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 125184 )
									ret := -0.625000
						if( ema13 > -0.56313 )
							if( Positive_Money_Flow_Sum <= 3.08247e+06 )
								if( Money_Flow_Ratio <= 0.002883 )
									ret := 0.696970
								if( Money_Flow_Ratio > 0.002883 )
									ret := -0.015682
							if( Positive_Money_Flow_Sum > 3.08247e+06 )
								if( ema13 <= 0.096991 )
									ret := 0.182356
								if( ema13 > 0.096991 )
									ret := 0.520833
					if( ema12 > 0.012071 )
						if( ema1 <= 67.9775 )
							if( MFI_High <= -53.7366 )
								if( Money_Flow_Ratio <= 0.005922 )
									ret := 0.419355
								if( Money_Flow_Ratio > 0.005922 )
									ret := -0.349711
							if( MFI_High > -53.7366 )
								if( Raw_Money_Flow <= 193356 )
									ret := 0.054092
								if( Raw_Money_Flow > 193356 )
									ret := -0.280788
						if( ema1 > 67.9775 )
							if( Negative_Money_Flow_Sum <= 2.436e+07 )
								if( Negative_Money_Flow_Sum <= 462156 )
									ret := 0.380282
								if( Negative_Money_Flow_Sum > 462156 )
									ret := -0.142429
							if( Negative_Money_Flow_Sum > 2.436e+07 )
								if( Positive_Money_Flow_Sum <= 3.45008e+07 )
									ret := 0.321875
								if( Positive_Money_Flow_Sum > 3.45008e+07 )
									ret := 0.067992
				if( MFI > 59.9734 )
					if( Positive_Money_Flow_Sum <= 4.15081e+08 )
						if( Typical_Price <= 31.0114 )
							if( ema12 <= 0.01676 )
								if( ema2 <= 23.7199 )
									ret := -0.500000
								if( ema2 > 23.7199 )
									ret := 0.644068
							if( ema12 > 0.01676 )
								if( Money_Flow_Ratio <= 1.62378 )
									ret := -0.800000 // sell
								if( Money_Flow_Ratio > 1.62378 )
									ret := 0.260090
						if( Typical_Price > 31.0114 )
							if( Negative_Money_Flow_Sum <= 1.69393e+07 )
								if( Positive_Money_Flow_Sum <= 2.48795e+08 )
									ret := 0.139347
								if( Positive_Money_Flow_Sum > 2.48795e+08 )
									ret := -0.545455
							if( Negative_Money_Flow_Sum > 1.69393e+07 )
								if( Positive_Money_Flow_Sum <= 6.06156e+07 )
									ret := 0.483796
								if( Positive_Money_Flow_Sum > 6.06156e+07 )
									ret := 0.198276
					if( Positive_Money_Flow_Sum > 4.15081e+08 )
						if( Positive_Money_Flow_Sum <= 9.12257e+08 )
							if( Positive_Money_Flow <= 1829.16 )
								if( Negative_Money_Flow_Sum <= 5.78392e+07 )
									ret := -0.533333
								if( Negative_Money_Flow_Sum > 5.78392e+07 )
									ret := -0.062500
							if( Positive_Money_Flow > 1829.16 )
								if( Positive_Money_Flow <= 1.15635e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 1.15635e+07 )
									ret := -0.428571
						if( Positive_Money_Flow_Sum > 9.12257e+08 )
							ret := 1.000000 // buy
		if( Negative_Money_Flow > 527828 )
			if( Negative_Money_Flow_Sum <= 3.97009e+08 )
				if( Raw_Money_Flow <= 2.01018e+07 )
					if( MFI_Low <= 47.6194 )
						if( MFI_Low <= 14.0776 )
							if( Positive_Money_Flow_Sum <= 1.58561e+07 )
								if( Negative_Money_Flow_Sum <= 6.26145e+06 )
									ret := 0.272727
								if( Negative_Money_Flow_Sum > 6.26145e+06 )
									ret := 0.014571
							if( Positive_Money_Flow_Sum > 1.58561e+07 )
								if( MFI <= 17.3313 )
									ret := 0.365979
								if( MFI > 17.3313 )
									ret := 0.105882
						if( MFI_Low > 14.0776 )
							if( Typical_Price <= 24.3373 )
								if( MFI_Low <= 19.4472 )
									ret := 0.750000 // buy
								if( MFI_Low > 19.4472 )
									ret := 0.265625
							if( Typical_Price > 24.3373 )
								if( Money_Flow_Ratio <= 0.71668 )
									ret := -0.061414
								if( Money_Flow_Ratio > 0.71668 )
									ret := 0.012383
					if( MFI_Low > 47.6194 )
						if( MFI_High <= 17.2551 )
							if( ema13 <= 1.70336 )
								if( Negative_Money_Flow_Sum <= 4.3386e+07 )
									ret := 0.115199
								if( Negative_Money_Flow_Sum > 4.3386e+07 )
									ret := 0.305936
							if( ema13 > 1.70336 )
								if( Positive_Money_Flow_Sum <= 2.68412e+08 )
									ret := 0.046178
								if( Positive_Money_Flow_Sum > 2.68412e+08 )
									ret := -0.339450
						if( MFI_High > 17.2551 )
							if( Positive_Money_Flow_Sum <= 8.12117e+07 )
								ret := 0.500000
							if( Positive_Money_Flow_Sum > 8.12117e+07 )
								if( tema <= 278.598 )
									ret := -0.842105 // sell
								if( tema > 278.598 )
									ret := -0.428571
				if( Raw_Money_Flow > 2.01018e+07 )
					if( Negative_Money_Flow <= 2.03606e+08 )
						if( Negative_Money_Flow_Sum <= 2.71506e+08 )
							if( Positive_Money_Flow_Sum <= 6.70115e+08 )
								if( Positive_Money_Flow_Sum <= 1.23551e+06 )
									ret := -0.145210
								if( Positive_Money_Flow_Sum > 1.23551e+06 )
									ret := -0.000404
							if( Positive_Money_Flow_Sum > 6.70115e+08 )
								if( ema3 <= 330.779 )
									ret := 0.750000 // buy
								if( ema3 > 330.779 )
									ret := -0.700000 // sell
						if( Negative_Money_Flow_Sum > 2.71506e+08 )
							if( tema <= 59.6007 )
								ret := 1.000000 // buy
							if( tema > 59.6007 )
								if( ema12 <= -2.23949 )
									ret := -0.108392
								if( ema12 > -2.23949 )
									ret := -0.330317
					if( Negative_Money_Flow > 2.03606e+08 )
						if( Negative_Money_Flow_Sum <= 2.67995e+08 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 2.67995e+08 )
							if( Raw_Money_Flow <= 2.84107e+08 )
								ret := 0.142857
							if( Raw_Money_Flow > 2.84107e+08 )
								ret := 1.000000 // buy
			if( Negative_Money_Flow_Sum > 3.97009e+08 )
				if( Positive_Money_Flow_Sum <= 3.40639e+08 )
					if( Negative_Money_Flow_Sum <= 5.27897e+08 )
						if( Negative_Money_Flow <= 3.4484e+07 )
							if( tema <= 287.17 )
								if( Negative_Money_Flow_Sum <= 5.02304e+08 )
									ret := 0.789474 // buy
								if( Negative_Money_Flow_Sum > 5.02304e+08 )
									ret := 0.000000
							if( tema > 287.17 )
								if( MFI_Low <= 7.44201 )
									ret := 0.416667
								if( MFI_Low > 7.44201 )
									ret := -0.300000
						if( Negative_Money_Flow > 3.4484e+07 )
							if( ema3 <= 354.423 )
								if( ema1 <= 323.59 )
									ret := 0.155340
								if( ema1 > 323.59 )
									ret := 0.666667
							if( ema3 > 354.423 )
								if( Typical_Price <= 354.25 )
									ret := -0.875000 // sell
								if( Typical_Price > 354.25 )
									ret := -0.047619
					if( Negative_Money_Flow_Sum > 5.27897e+08 )
						if( ema2 <= 214.691 )
							if( MFI_High <= -50.0029 )
								if( Negative_Money_Flow_Sum <= 6.45056e+08 )
									ret := 0.660714
								if( Negative_Money_Flow_Sum > 6.45056e+08 )
									ret := 0.195652
							if( MFI_High > -50.0029 )
								ret := -0.333333
						if( ema2 > 214.691 )
							if( Typical_Price <= 418.595 )
								if( ema13 <= -14.8838 )
									ret := 0.000000
								if( ema13 > -14.8838 )
									ret := 0.940476 // buy
							if( Typical_Price > 418.595 )
								ret := -0.250000
				if( Positive_Money_Flow_Sum > 3.40639e+08 )
					if( Typical_Price <= 190.364 )
						if( MFI_High <= -44.6483 )
							if( Positive_Money_Flow <= 1.05068e+07 )
								ret := -0.250000
							if( Positive_Money_Flow > 1.05068e+07 )
								ret := -1.000000 // sell
						if( MFI_High > -44.6483 )
							if( Negative_Money_Flow_Sum <= 4.65875e+08 )
								ret := 0.000000
							if( Negative_Money_Flow_Sum > 4.65875e+08 )
								if( ema1 <= 169.437 )
									ret := 0.958333 // buy
								if( ema1 > 169.437 )
									ret := 0.562500
					if( Typical_Price > 190.364 )
						if( ema3 <= 309.326 )
							if( Money_Flow_Ratio <= 2.14271 )
								if( Positive_Money_Flow_Sum <= 8.04489e+08 )
									ret := -0.443396
								if( Positive_Money_Flow_Sum > 8.04489e+08 )
									ret := -1.000000 // sell
							if( Money_Flow_Ratio > 2.14271 )
								ret := 0.857143 // buy
						if( ema3 > 309.326 )
							if( Positive_Money_Flow_Sum <= 4.18914e+08 )
								if( MFI <= 43.3283 )
									ret := -0.166667
								if( MFI > 43.3283 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 4.18914e+08 )
								if( Positive_Money_Flow_Sum <= 9.54152e+08 )
									ret := 0.875000 // buy
								if( Positive_Money_Flow_Sum > 9.54152e+08 )
									ret := -0.444444
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_TWLO_15Min_f85f0a6c(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, ema2, ema1, ema12, ema3, ema13, tema)

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


